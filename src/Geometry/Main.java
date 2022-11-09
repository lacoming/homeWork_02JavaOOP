package Geometry;

import Geometry.geometrypackage.*;

public class Main {

    private static Shape[] generateShapes(){
        Shape[] shapes = new Shape[15]; // 25

        for(int i = 0; i < (shapes.length / 3); ++i){
            shapes[i] = new Cicle(5.5 + i);
        }
        for(int i = (shapes.length / 3); i < 2 * (shapes.length / 3); ++i){
            shapes[i] = new Sqare(6.2 + i);
        }
        for(int i = 2 * (shapes.length / 3); i < shapes.length; ++i){
            shapes[i] = new Rectangle(3.3 + i, 4.4 + i);
        }
        for(int i = shapes.length / 2; i < shapes.length; i++){
            shapes[i] = new Tetrahedron(2.3 + Math.sqrt(i));
        }
        for(int i = shapes.length - 1; i < shapes.length; i++){
            shapes[i] = new Melon();
        }

        // TODO: Add 1 shape and 1 non shape

        return shapes;
    }

    public static void main(String[] args) {

        double comulativeArea = 0;
        for(Shape shape: generateShapes()){
            System.out.println(shape.getArea());
            comulativeArea += shape.getArea();
        }
        System.out.println(comulativeArea);

        /*
        Document[][] documentsMatrix = new Document[3][3];

        for(int i = 0; i < documentsMatrix.length; i++){
            for(int j = 0; j < documentsMatrix[i].length; ++j) {
                documentsMatrix[i][j] = new Document();
            }
        }

        for(Document[] documents: documentsMatrix){
            System.out.println("Surname: all documents");
            for(Document document: documents){
                System.out.print(document);
                System.out.println();
            }
        }

         */

        //PDFDocument fdfDucument = new PDFDocument();
        //TableDocument tableDocument = new TableDocument();

        /*
        if(documentsMatrix[0][1] == documentsMatrix[1][2]){
            System.out.println("Brothers");
        }
         */

        /*
        Scanner sc = new Scanner(System.in);
        String name = "undefined";
        String surname = "undefined";
        int age = 0;
        int commandID = 0;
        int input;
        System.out.println(" 1. Ввести имя\n 2. Ввести фамилию\n 3. Ввести год рождения\n 4. Вывести информацию\n 0. Выход");

        final int RET_DECISION = 300;

        // while(True)
        // break

        try {
            while (commandID != RET_DECISION) {
                input = sc.nextInt();
                switch (input) {
                    case (1) -> {name = sc.next(); break;}
                    case (2) -> {surname = sc.next(); break;}
                    case (3) -> {age = sc.nextInt(); break;}
                    case (4) -> {System.out.println(name + "\n" + surname + "\n" + age); break;}
                    case (0) -> {commandID = RET_DECISION; break;}
                    default -> {System.out.println("wrong"); break;}
                }
            }
        }
        catch(InputMismatchException ex){
            System.out.println(ex.toString());
        }
        catch(NumberFormatException ex) {
            System.out.println(ex.toString());
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }

         */
    }
}


