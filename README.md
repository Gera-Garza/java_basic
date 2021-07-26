# General info
This is the repository for the course of Java_basics with Platzi, here you will see what I consider to be the most used topics and some examples.

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Summary](#summary)
> * [Variables](#variables)
> * [Access](#access)
> * [Classes](#classes)
> * [Control](#control)
> > * [Desicion](#desicion)
> > * [Loop](#loop)
	
## Technologies
Project is created with:
* VS code
> * Inside VSCode Java Extension Pack

	
## Setup
Install [Vscode](https://code.visualstudio.com/download) in your computer.

Then in the extensions tab search for **Java Extension Pack** and install it.

Start your proyect creating your files with **.java**  

## Summary
In this course we see how to create a class, how to define and fill variables, the diferent loops like for loop or while loop, also some condicionals like **==** 
or **>=**, **<=** and many others, and this is just a very general idea of how the course is.

### Variables
So there is so many different kinds of variables, for example:
| Variable      | Descripcion   | size  |
| ------------- |:-------------:| -----:|
| byte     | Stores whole numbers from -128 to 127  | 1 byte|
| short | Stores whole numbers from -32,768 to 32,767  | 2 bytes|
| int    | Stores whole numbers from -2,147,483,648 to 2,147,483,647  | 4 bytes|
| long    |Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807  | 8 bytes|
| float    | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits  |4 bytes|
| double    |Stores fractional numbers. Sufficient for storing 15 decimal digits  |  8 bytes|
|boolean    | Stores true or false values  | 1 bit|
| char     | Stores a single character/letter or ASCII values | 2 bytes|


### Access
In here are some ways to declare it and I am talking about the access to the clases.
<img src="image/access.png" height="200">


### Classes
> **TIP**: For the program to recognice what to run is neccesary the **main** function
```java
public class holamundo {
    public static void main(String[] args) {
        System.out.println("hola mundo");
    }
}
```


```java
public class Variables {
    public static void main(String[] args) {
        //declarando una variable
        int speed;
        //asignando un valor a la variable
        speed = 10;
        System.out.println(speed);
        
}
```
> Here are some examples of how you can declare arrays
 ```java
 String androidVersions[] = new String[17];
        String[] days = new String[7];

        String cities[][] = new String[4][2];
        int numbers[][][] = new int[1][2][3];
        int numbers4[][][][] = new int[2][2][2][2];

        androidVersions[0]= "Apple Pie";
        androidVersions[1]= "Bannana Bread";
        androidVersions[2]= "Cupcake";
        androidVersions[3]= "Donut";
```

### Control
There are many ways to control the flow of the program with this conditionals functions like loops, id, else, else if, while, do while, for, foreach, switch. 

#### Desicion
The condicionals are the boolean results of comparing some values or variables,which includes the comands if, else, some combination of the two before and switch here are some examples: in java 1.8
 ```java
public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        int option=0;

        //operadores de comparacion
        System.out.println("a es igual a b? -> "+ (a==b));
        System.out.println("a es diferente de b? -> "+ (a!=b));

        //operadores de relacion
        System.out.println("a es mayor a b? -> "+ (a>b));
        System.out.println("a es menor de b? -> "+ (a<b));
        System.out.println("a es mayor o igual a b? -> "+ (a>=b));
        System.out.println("a es menor o igual de b? -> "+ (a<=b));

        if(a == b){
            System.out.println("a es igual a b? -> "+ (a==b));
        }else if(a != b){
            System.out.println("a es diferente de b? -> "+ (a!=b));
        }else if(a > b){
            System.out.println("a es mayor a b? -> "+ (a>b));
        }else if(a < b){
            System.out.println("a es menor de b? -> "+ (a<b));
        }

        //here is an example of the switch
        switch (option) {
        case 1:
           System.out.println("a es igual a b? -> "+ (a==b));
             break;
        case 2:
           System.out.println("a es diferente de b? -> "+ (a!=b));
             break;
        case 3:
             System.out.println("a es mayor a b? -> "+ (a>b));
            break;
        default:
           System.out.println("a es menor de b? -> "+ (a<b));
}
    }
}
```

#### Loops
So there are 2 principal kinds of loops,they have some variations but they are the principals: **For** loops and **While** loops here are some examples: made in java 1.8
 ```java
 public class SosSignal {
  static  boolean isTurnOnLigth = false;

    public static void main(String[] args) {
        turnOnOffLigth();

        for (int i = 1; i <= 10; i++) {
            printSOS();
        }
        
        //Here is the while
        int i=0;
        while(i<10){
            printSOS();
        }
    }

    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLigth() {
        isTurnOnLigth = (isTurnOnLigth)?false:true;
        return isTurnOnLigth;
    }
}
```

