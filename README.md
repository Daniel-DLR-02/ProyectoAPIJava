# **Expresiones Lambda**

## **1. Introducción**
***  
Las expresiones lambda fueron introducidas en Java SE8 (aunque ya se utilizaba en otros lenguajes como Python o C#), junto con la API Stream. Fueron introducidos para crear código más conciso y significativo.  
Además, abren la puerta hacia la programación funcional.

## **2. Introducción a la programación funcional**
***
### 2.1 Funciones como entidades de primer nivel
<br>
Uno de los conceptos básicos de la programación funcional es que las funciones funcionan como entidades de primer nivel, es decir, aparecen como si fueran valores primitivos u objetos. Esto significa que podremos pasar funciones como variables, variables de retorno o parámetros de otras funciones. 

De esta forma, tenemos la posibilidad de pasar **comportamiento como valor**.

### 2.2 Clases anónimas
<br>
Una clase anónima nos permite declarar una clase e instanciarla donde nos haga falta, haciendo nuestro código más legible y económico.

Se trata de una clase que no tiene nombre, no produce su propio archivo .java y tampoco es una clase interna.

Las clases anónimas nos permiten crear e instanciar una clase directamente para una función concreta, sin la necesidad de crear clases normales sólo para una caso específico y puntual.

Por ejemplo, teniendo la clase *VehiculoConRuedas* creada, podemos crear una clase anónima e instanciarla en el mismo bloque de código:

```java
VehiculoConRuedas triciclo = new VehiculoConRuedas("Fisher-Price", "Multicolor") {
    
    @Override
    public int getNumeroDeRuedas() {
        return 3;
    }

  };
```

La diferencia entre una clase normal y una anónima la marca el punto y coma después de la llave de cierre de la clase anónima.


Las clases anónimas son la antesala para entender cómo funcionan las expresiones lambda.

### 2.3 Concepto de *Scope*
<br>
El scope o ámbito de una clase nos indica en qué partes de un programa podemos usar las instancias de una clase concreta. Este concepto es ampliable para las variables. 

De esta forma, según donde se declare una variable, podrá ser utilizada en ciertas partes de un programa, mientras que en otras no será posible. Por ejemplo, una variable declarada dentro de de un bloque (método/función/procedimiento) sólo será válida dentro de ese bloque y será destruida al finalizar éste. Este elemento ya ha sido trabajado en el uso de métodos o en el uso de bucles *for*, donde declarábamos una variable:

```java 
int i=0
```


y sólo existía dentro de las llaves del bucle *for*.

## **3. Expresiones lambda**
***
### 3.1 Concepto
<br>
Una expresión lambda es, esencialmente, un método anónimo. Sin embargo, este método no se ejecuta solo, sino que se utiliza para implementar un método definido por una interfaz funcional (que se explicaran más adelante). Es decir, una expresión lambda da como resultado una forma de clase anónima.
<br><br>
Una expresión lambda tiene la siguiente estructura:

```java
(arg1,arg2...) -> {cuerpo}
```

Podemos observar que se compone de 2 partes divididas por un ->, que un nuevo tipo de operador llamado **operador lambda** u **operador flecha**:

1. La parte izquierda especifica los parámetros requeridos por la expresión lambda.
2. En la parte derecha está el cuerpo lambda, que especifica las acciones de la expresión lambda.

Java define dos tipos de cuerpos lambda. Un tipo consiste en una sola expresión, y el otro tipo consiste en un bloque de código. En este punto sólo vamos a ver expresiones lambda con una sola expresión en su cuerpo.

Vamos a ver algunos ejemplos para entender mejor las expresiones lambda:

```java
() -> 31.4
```

Este es un ejemplo de la forma más simple de una expresión lambda. No tiene parámetros, por lo que la parte izquierda esta vacía, y en la parte derecha simplemente devuelve el valor constante *31.4*

El tipo de devolución se infiere que es *double* (este concepto está explicado en el trabajo de otro compañero). Por lo tanto, la expresión anterior es equivalente a:

```java
double miMetodo(){
  return 31.4;
}
```

Otro ejemplo más complejo podría ser:

```java
() -> Math.random() * 100;
```

En este caso obtenemos un número aleatorio utilizando *Math.random()* y lo multiplicamos por 100, que sería equivalente a:

```java
double miMetodo(){
  return Math.random * 100;
}
```

Si la expresión lambda requiere un parámetro, entonces lo especificamos en la parte izquierda:


```java
(n) -> 1.0/n;
```

Gracias a la inferencia de tipos, no es necesario especificar el tipo de *n*. De nuevo, esto es equivalente a:

```java
double miMetodo(double n){
  return 1.0/n;
}
```

Los parámetros de la expresión lambda sólo deben ir entre paréntesis si hay más de uno, aunque se pueden colocar en todos los casos según el criterio personal del programador. Esto quiere decir que, al igual que con los métodos, una expresión lambda puede tener tantos parámetros como sea necesario.

Cualquier tipo válido se puede usar como tipo de devolución de una expresión lambda.

```java
n -> (n%2) == 0;
```

En este caso, la expresión lambda devolverá un booleano.

# 4. Interfaces Funcionales

### 4.1.Concepto

Estas interfaces funcionales son un concepto de Java agregado en su octava versión y de forma resumida, podemos decir que son interfaces que cuentan con un método abstracto. 
Estas interfaces cuentan tres condiciones principales por la que se rigen:

1. La interfaz funcional solamente tiene un método abstracto.

2. Cualquier método abstracto que también sea un método público en la clase Object no se cuenta como ese método.

3. La interfaz funcional puede tener métodos predeterminados y métodos estáticos.

---

### 4.2.Ejemplificación


Una vez dicho esto comenzaré con un ejemplo simple de este:
Para empezar voy a crear una interfaz (llamada a continuación ISaludarUsers) en este caso con dos métodos, uno de ellos ya escrito, que lo que haga sea "saludar al usuario de forma genérica” y otro método abstracto, el cual vamos a buscar que salude al usuario por un nombre que se le pase al método.
 
En la siguiente imágen podemos ver esta interfaz ya creada.En esta cabe destacar la anotación **“@FunctionalInterface”**, esta nos va ayudar a la hora de ir escribiendo código, ya que si no cumplimos con las reglas propuestas por la interfaz funcional,el IDE nos marcará un error.

Además de esto, quiero resaltar el uso del “default” en la clase “saludarUsuario” para que este método no necesite estar implementado.

```java
package ppal;

@FunctionalInterface
public interface ISaludarUser{

    public void saludarUsuarioPorNombre(String nombre);

    public default void saludarUsuario(){
    	
      System.out.println("Bienvenido,usuario");
      
    }
}
```
---

Una vez tenemos creada nuestra interfaz funcional, ahora es el momento para implementar lambda dentro de esta.En este caso escribiremos el método abstracto en el main.

```java
package ppal;

public class Principal{
    
    public static void main(String[] args) {

        ISaludarUser saludarUsuario = (username) -> System.out.println("Bienvenido," + username);

        saludarUsuario.saludarUsuario();
				
        saludarUsuario.saludarUsuarioPorNombre("GenericUserName1903");	
    }
}
```
Aquí para hacer uso del lambda lo que he hecho es añadir la siguiente sintaxis:

"Nombre de la interfaz" "Nombre del método abstracto a definir"=("variables que le pasamos al método") -> {"Código del método"}

* **Siendo "->" el operador.**
* **Si el código a introducir es de una línea,no es necesario que se pongan "{ }".**
 
 Por último me gustaría dponer un ejemplo de interfaz funcional que a nosotros nos pilla muy de cerca, esta es **Comparator**,esta cumple con los requisitos previamente planteados ,siendo su unica clase abstracta **compare(T o1,T o2)**. Lo que quiero decir con este ejemplo es que este tipo de interfaces también se encuentran presentes en el mismo API de Java.

 Finalmente podemos ver que el output del programa queda de la siguiente manera:

 ```java
	Bienvenido,usuario
	Bienvenido,GenericUserName1903	
 ```

## **5. Predicados**
***
### 5.1 Concepto
<br>
Un Predicado o Predicate es una interfaz funcional que define una condición que un objeto determinado debe cumplir. 

Dispone de un único método denominado *test()* que recibe el objeto y comprueba si cumple la condición.

Vamos a ver un ejemplo de Predicado usando la clase Camisa:

```java
//Creamos la clase Camisa
public class Camisa{

 private String color;
	private int id;
	private double precio;
	private String talla;
	
 public Camisa(String color, int id, double    precio, String talla) {
		super();
		this.color = color;
		this.id = id;
		this.precio = precio;
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Camisa [color=" + color + ", id=" + id + ", precio=" + precio + ", talla=" + talla + "]";
	}

}
```

Ahora creamos una lista de camisas para trabajar con ella:

```java
public static void main(String[] args) {
		
	List<Camisa> lista = new ArrayList<Camisa>();
		
	Camisa c1 = new Camisa("Rojo",10,5.99,"XL");
	Camisa c2 = new Camisa("Azul",11,4.95,"S");
	Camisa c3 = new Camisa("Verde",12,8.99,"L");
		
	lista.add(c1);
	lista.add(c2);
	lista.add(c3);
		
}
```
A continuación creamos un Predicado que se encargue de definir la condición que permita filtrar la lista:

```java
Predicate<Camisa> predicadoTalla = new Predicate<Camisa>() {
			
  public boolean test(Camisa c) {

    return c.getTalla().equals("S");
  }

};
```

De esta forma hemos creado un Predicado que nos permitirá filtrar aquellas camisas que no sean de la talla S.

Además, en la creación del Predicado anterior podemos observar varias cosas:

1. La declaración del Predicado debe terminar con punto y coma, ya que se trata de una clase anónima.
2. Ya que *Predicate* es una interfaz funcional (y, por lo tanto, abstracta) cuyo único método es *test()*, es necesario implementarlo.

Adicionalmente, para poder trabajar con Predicados es necesario importar la librería *java.util.function.Predicate*


### 5.2 Uso
<br>
La función principal de los Predicados es servir como argumento para ciertas funciones de Streams y en métodos referenciales.

Siguiendo el ejemplo anterior, vamos a mostrar una forma de trabajar con Predicados en Streams:

```java
lista.stream().forEach(new Consumer<Camisa>(){
			
	public void accept(Camisa c) {
		System.out.println(c.getTalla());
	}
});
```

Primero convertimos la lista en un Stream para poder trabajar con sus funciones.

```java
lista.stream().filter(predicadoTalla).forEach(c -> System.out.println(c.getTalla()));
```

Usando la función *filter* a la que le pasamos el Predicado creado anteriormente, conseguimos filtrar las camisas y sólo quedarnos con aquellas que cumple la condición del Predicado. De esta forma, los *Streams* se apoyan en los *Predicate* para implementar algunas de sus funciones.

Como conclusión, podemos fusionar todo lo visto hasta ahora, es decir, expresiones lambda y Predicados para mejorar nuestro ejemplo aún más:

```java
lista.stream()
.filter(c -> c.getTalla().equals("S"))
.forEach(c -> System.out.println(c.getTalla()));
```

### 5.3 Métodos
<br>
A pesar de que el método test() es el más usado dentro de la interfaz Predicate, existen algunos más que nos pueden resultar útiles.


#### 5.3.1 Método *and()*
<br>
Este método nos permite unir dos Predicados y que la condición se cumpla si ambos son ciertos.

```java
Predicate<Camisa> predicadoTalla = c -> c.getTalla().equals("S");
Predicate<Camisa> predicadoColor = c -> c.getColor().equals("Verde");

Predicate<Camisa> predicadoTallaColor = c -> predicadoTalla.and(predicadoColor); 
```

#### 5.3.2 Método *or()*
<br>
Este método nos permite unir dos Predicados pero hace que la condición se cumpla si uno de los dos es cierto.

```java
Predicate<Camisa> predicadoTalla = c -> c.getTalla().equals("S");
Predicate<Camisa> predicadoColor = c -> c.getColor().equals("Verde");

Predicate<Camisa> predicadoTallaColor = c -> predicadoTalla.or(predicadoColor); 
```

#### 5.3.3 Método *negate()*
<br>
Este método nos permite modificar el Predicado y añadir una negación de modo que se cumpla lo contrario.

```java
Predicate<Camisa> predicadoTalla = c -> c.getTalla().equals("S");
Predicate<Camisa> predicadoColor = c -> c.getColor().equals("Verde");

Predicate<Camisa> predicadoTallaColor = c -> predicadoTalla.or(predicadoColor).negate(); 
```
