/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package studentarray;

import java.util.Scanner;

/**
 *
 * @author Megha Patel
 */
public class StudentArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //   Student s1=new Student();
        Scanner input=new Scanner(System.in);
        
        System.out.println("name: "+s1.getName());
        
        Student[] studList=new Student[3];// array of student objects
        for(int i=0; i<studList.length;i++)
        {
                 System.out.println("Enter student name: ");
                 studList[i].setName(input.nextLine());
      
        }
     for(int i=0; i<studList.length;i++)
        {
                 System.out.println("student name: "+studList[i].getName());
                  
        }
    
    }
    
    

}
