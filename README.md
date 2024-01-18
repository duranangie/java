
# Matrices

Un literal es la representación de código fuente de un valor fijo. Una matriz es un objeto contenedor que contiene un número fijo de valores de un solo tipo. La longitud de una matriz se establece cuando se crea la matriz. Después de la creación, su longitud es fija.

### Creación, inicialización y acceso a una matriz



```
package com.example;

public class Main {
    public static void main(String[] args) {
        // creamos el arrays


        String[][] names = {
               /*0 */ { "Mr. ", "Mrs. ", "Ms. " },
                        /*0 */ /*1 */   /*2 */  
             /*1 */   { "Smith", "Jones" }
        };              /*0 */    /*1 */

        System.out.println(names[0][1]+names[1][1]);
        System.out.println(names[0][2]+names[1][0]);
        System.out.println(names.length); //mirar el tamaño de la arrays
    }
}


//recordar que el primer[] es la fila  y luego las columnas

```

### Copia de matrices


```
package com.example;

public class Main {
    public static void main(String[] args) {
        // creamos el arrays
        String[] copiaString={
            "Affogato","Americano","Cappuccino","Corretto","Cortado",
            /*0 */     /* 1 */        /*2 */       /*3 */    /*4 */
            "Doppio","Espresso","Frapuccino","Freddo","Lungo","Macchinato",
              /*5 */     /* 6 */        /*7 */       /*8 */    /*9 */
            "marocchino", "Ristreto" }; //se crean los valores de la matriz
                /*10 */     /*11 */
        
        String[]copyTo = new String[7];  // se genera la matriz copia
        System.arraycopy(copiaString,2,copyTo,0,7);  //Se genera la copia que inicializa en  2 hasta el 7
        for(String coffee: copyTo){  // aca se recorre la matriz con un for llamado coffee que recorre la lista y me imprime los datos que hay en ella.
            System.out.println(coffee +"");  
        }

     
}

}
```

## Manipulaciones de matrices

### BinarySearch 
```
package com.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // creamos el arrays
        String[] copiaString={
            "Affogato","Americano","Cappuccino","Corretto","Cortado",
            /*0 */     /* 1 */        /*2 */       /*3 */    /*4 */
            "Doppio","Espresso","Frapuccino","Freddo","Lungo","Macchinato",
              /*5 */     /* 6 */    /*7 */    /*8 */    /*9 */
            "marocchino", "Ristreto" }; //se crean los valores de la matriz
                /*10 */     /*11 */

                //hacer busqueda
            int busqueda = java.util.Arrays.binarySearch( copiaString,"Cappuccino"); /*se genera la busqueda del arra */
            String[] copyto = Arrays.copyOfRange(copiaString,9, busqueda +8);/*Se hace la copia de la matriz */
            for(String coffee:copyto  ) {
                System.out.println(coffee + " ");
            }

    
}

}

```


## equals

```
package com.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // creamos el arrays
        String[]copia1={"a","b","c"};
        String[]copia2= {"a","b","c"}; /*Cambiar la letra para verificar que no se realice la copia */                 
                
            /*comparar */
            
                /*Realizar copia si son iguales */
            if (Arrays.equals(copia1, copia2)) {   /*Se genera un if donde se verifica si el arrays es igual entonces */
                System.out.println("Son iguales"); /*imprimer que son iguales */
                String[] copyTo = new String[3];/*se crea un Arrays donde se estipula que sea de tamaño 3 */
                System.arraycopy(copia1, 0, copyTo, 0,3);/*y se realiza la copia que va desde 0 a 3 */
                for(String coffee:copyTo  ) { /*Se recorre la lista para verificar que se haya realizado la copia*/
                    System.out.println(coffee + " ");
                }
            }else{
                System.out.println("No son iguales"); /*Si no se verifica que no son iguales salta el mensaje  */
            }       

    
}

}

```

## Fill

```
package com.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /* Funcion fill */
        String[] arrayOriginal = {
                "one", "two", "three", "four", "five"
        };

        Arrays.fill(arrayOriginal, 0, 1, "zero");  /*Aca podemos hubicar el "zero" en la posicion que queramos */

        /* Realizamos la copia del arrays */
        String[] copiaArrays = new String[5];
        copiaArrays = Arrays.copyOfRange(arrayOriginal, 0, 5);

        for (String nombres : copiaArrays)
            System.out.println(nombres);

    }

}
```

## parallelSort()

```

package com.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arraysPrimera={1,2,3,4,9,8,7};  /* Se crean los arrays */

        Arrays.parallelSort(arraysPrimera); /*creamos el parallelSort para que nos ordene los numeros ingresados donde llamamos nuestro arrays */
        
        /*realizamos la coppia */
        int[] copiaArrays = new int[6];
        copiaArrays = Arrays.copyOfRange(arraysPrimera,0,7);

        for(int numeros : copiaArrays){  /*y lo recorremos para que nos recorra ordenadamente */
        System.out.println(numeros);
        }
      
    }

}

```

## Stream()

````
package com.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    /*Java stream */

    String[] arraysinicial={"a","b","c"};
    Arrays.stream(arraysinicial);/* El Arrays.stream sirve para  realizar la copia*/
    for(String copyTo : arraysinicial) {
        System.out.println("Valor de la variable copiada: "+copyTo);
        
    }
    }

}
````

## to String
* Sirve para convertir elementos de la matriz en cadenas

````
package com.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /* Java String */

        String[] arraysinicial = { "a", "b", "c" };

        String[] copiaarrays= new String[4];
        copiaarrays = Arrays.copyOfRange(arraysinicial, 0, 3);
        System.out.println(java.util.Arrays.toString(copiaarrays)); /*convierte la matriz en cadena */



    }
}

````
