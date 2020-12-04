package 1dv506_lab3;

class multiDisplayMain {

public static void main(String[] args)
{
 multiDisplay md=new multiDisplay();

md.setDisplayMessage("Hello World!");

md.setDisplayCount(3);
md.display();                           

md.display("Goodbye cruel world!", 2);  
System.out.println("Current Message: "+ md.getDisplayMessage());
}
}
