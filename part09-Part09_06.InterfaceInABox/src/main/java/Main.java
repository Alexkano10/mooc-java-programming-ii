
public class Main {

    public static void main(String[] args) {

                Box box1 = new Box(10);  // Caja con un peso máximo de 10 kg
                Box box2 = new Box(5);   // Caja con un peso máximo de 5 kg
                Box box3 = new Box(15);  // Caja con un peso máximo de 15 kg
        
                // Añadimos algunos libros y CDs a la primera caja
                box1.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
                box1.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        
                // Añadimos una caja dentro de otra caja
                box2.add(new Book("Robert Martin", "Clean Code", 1));
                box2.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
                
                // Añadimos una caja más grande a la caja 1
                box3.add(box1);  // Caja 1 dentro de la caja 3
        
                // Intentamos agregar una caja dentro de sí misma (esto debería ser evitado)
                box1.add(box1);  // Esto causaría problemas (bucle infinito)
        
                System.out.println(box3);  // Imprime el estado de la caja 3 (que contiene box1)
                System.out.println(box1);  // Imprime el estado de la caja 1
                System.out.println(box2);  // Imprime el estado de la caja 2
            }
        }
        

