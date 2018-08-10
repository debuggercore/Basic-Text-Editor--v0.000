/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication5;

/**
 *
 * @author SUJITHA
*/
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */

import java.util.*;
//import java.io.*;
import javax.swing.JOptionPane;


  






/*public class TextEditor {
    
    public static void main(String s[]) throws FileNotFoundException, IOException {
    String filename;
   filename = JOptionPane.showInputDialog("ENTER THE FILENAME");
    DLL [] l= new DLL[100];
    DLL g;//for creating new link
    /*for(int i=0; i<2; i++){
        l[i]=new DLL();
    }
    String input,input1;//used when two diff inputs are required
   PrintWriter outputfile = new PrintWriter(filename);
        JOptionPane.showMessageDialog(null,"enter line by line and enter save to exit ");
        String choice;
        StringTokenizer word;
        
        int i=0;
        String h;
        
        do{
        String w = JOptionPane.showInputDialog("ENTER THe line"); 
        word=new StringTokenizer(w," ");
        l[i]=new DLL();
        while(word.hasMoreTokens()){
            
           
            h=word.nextToken();
         l[i].insertWordL(h);
          
       
        } i++;
        outputfile.println(w);
        choice = JOptionPane.showInputDialog("enter y to continue else n ");
        }while("y".equals(choice)||"Y".equals(choice)&&i<100);
        for(int j=0; l[j]!=null&&j<i;j++){
      l[j].display();
      System.out.println();
    }String k;
   //do{
    k = JOptionPane.showInputDialog("ENTER your choice whether word or line or exit ");     
        switch (k) {
            case "word":
                {
                    int line;
                    input=JOptionPane.showInputDialog("Enter line number to be edited");
                    line=Integer.parseInt(input);
                    do{
                   input = JOptionPane.showInputDialog("here's the list \n 1:insert word beginning\n 2: Insert at end\n 3: insert at any position\n4:replace at first\n 5:replace at end\n6:replace at any position\n7:Delete first\n8:Delete last\n9:Delete at any position ");     
                      int d;
                      d=Integer.parseInt(input);
                      
                     
                      switch(d){
                          case 1:
                              input=JOptionPane.showInputDialog("Enter word");
                              l[line-1].insertWordB(input);
                              break;
                            case 2:
                              input=JOptionPane.showInputDialog("Enter word");
                              l[line-1].insertWordL(input);
                              break; 
                                
                                case 3:
                                    
                                   
                                    input=JOptionPane.showInputDialog("Enter word ");
                              input1=JOptionPane.showInputDialog("Enter position");
                              l[line-1].insertWordAnyPos(input,Integer.parseInt(input1));
                              break;
                                    case 4:
                                   try { 
                                   
                                    input=JOptionPane.showInputDialog("Enter word ");
                              
                              l[line-1].replaceWordB(input);
                                   }
                                   catch(EmptyDoublyLinkedList e){}
                              break;
                                       
                             case 5:
                                   try { 
                                   
                                    input=JOptionPane.showInputDialog("Enter word ");
                              
                              l[line-1].replaceWordL(input);
                                   }
                                   catch(EmptyDoublyLinkedList e){}
                              break; 
                     
                                 case 6:
                                   try { 
                                   
                                    input=JOptionPane.showInputDialog("Enter word ");
                              input1=JOptionPane.showInputDialog("Enter pos");
                              
                              l[line-1].replaceWordatAnyPos(input, Integer.parseInt(input1));
                                   }
                                   catch(EmptyDoublyLinkedList e){}
                              break;
                                case 7:
                                   try { 
                                   
                                    
                              
                              l[line-1].deleteWordB();
                                   }
                                   catch(EmptyDoublyLinkedList e){}
                              break; 
                                    case 8:
                                   try { 
                                   
                                    
                              
                              l[line-1].deleteWordL();
                                   }
                                   catch(EmptyDoublyLinkedList e){}
                              break; 
                                        case 9:
                                   try { 
                                   
                                    input1=JOptionPane.showInputDialog("Enter pos");
                              
                              l[line-1].deleteWordatAnyPos(Integer.parseInt(input1));
                                   }
                                   catch(EmptyDoublyLinkedList e){}
                              break; 
                                        default:
                                            break;
                      }
                      
                       input=JOptionPane.showInputDialog("Continue: y or n");
                    }while(input.equals("y")||input.equals("Y"));
                    break;
                }
            case "line":
{
                 
                 input = JOptionPane.showInputDialog("here's the list for lines \n 1:insert line beginning\n 2: Insert at end\n 3: insert at any position\n4:replace at first\n 5:replace at end\n6:replace at any position\n7:Delete first\n8:Delete last\n9:Delete at any position ");     
                    int d;
                    d=Integer.parseInt(input);
                      
                    switch(d){
                        case 1: 
                            input=JOptionPane.showInputDialog("Enter line");
                          g=new DLL();
                            word=new StringTokenizer(input, " ");
                            while(word.hasMoreTokens()){
                                g.insertWordL(word.nextToken());
                            } 
                            l[i]=new DLL();
                            for(int j=i-1; j>=0; j--){
                               
                                l[j+1]=l[j];
                            }
                            i++;
                            l[0]=g;
                            break;
                            
                        case 2:
                            input=JOptionPane.showInputDialog("Enter line");
                          g=new DLL();
                            word=new StringTokenizer(input, " ");
                            while(word.hasMoreTokens()){
                                g.insertWordL(word.nextToken());
                            }
                            l[i]=new DLL();
                            l[i]=g;
                            i++;
                            break;
                        case 3:
                            input=JOptionPane.showInputDialog("Enter line");
                            input1=JOptionPane.showInputDialog("Enter position");
                          g=new DLL();
                            word=new StringTokenizer(input, " ");
                            while(word.hasMoreTokens()){
                                g.insertWordL(word.nextToken());
                            }
                            l[i]=new DLL();
                             for(int j=i-1; j>=Integer.parseInt(input1)-1; j--){
                                l[j+1]=l[j];
                            }
                             i++;
                            l[Integer.parseInt(input1)-1]=g;
                            break;
                        case 4:
                            input=JOptionPane.showInputDialog("Enter line");
                          g=new DLL();
                            word=new StringTokenizer(input, " ");
                            while(word.hasMoreTokens()){
                                g.insertWordL(word.nextToken());
                            }
                            l[0]=g;
                            
                           break;
                            
                            case 5:
                            input=JOptionPane.showInputDialog("Enter line");
                          g=new DLL();
                            word=new StringTokenizer(input, " ");
                            while(word.hasMoreTokens()){
                                g.insertWordL(word.nextToken());
                            }
                            l[i-1]=g;
                            
                           break;
                            case 6:
                            input=JOptionPane.showInputDialog("Enter line");
                            input1=JOptionPane.showInputDialog("Enter position");
                          g=new DLL();
                            word=new StringTokenizer(input, " ");
                            while(word.hasMoreTokens()){
                                g.insertWordL(word.nextToken());
                            }
                            l[Integer.parseInt(input1)-1]=g;
                            
                           break;
                                case 7:
                            for(int j =0; j<i-1 ; j++){
                            l[j]=l[j+1];
                            }
                            l[i-1]=null;
                            i--;
                            
                          break;
                                    case 8:
                            
                            l[i-1]=null;
                            i--;
                            
                          break;
                                    case 9:
                                        input1=JOptionPane.showInputDialog("enter the position");
                            for(int j =Integer.parseInt(input1)-1; j<i ; j++){
                            l[j]=l[j+1];
                            }
                            l[i]=null;
                            i--;
                            
                          break;    
                                    default :
                                        break;
                            
                    }
                    
                
                }
            default:
                
                break;
        }

    

FileWriter fwriter=new FileWriter(filename,true);
        try (PrintWriter outputfile1 = new PrintWriter(fwriter)) {
            for(int j=0;j<i; j++){
                Node p =l[j].header.next ;
                while(p!=l[j].trailer){
                    
                    outputfile1.print(p.getString()+" ");
                    p=p.getNext();
                }
                
                outputfile1.println();
                l[j].display();
                System.out.println();
            }
           
        }





}
}
*/
class Node{
public   Node next;
 public Node prev;
public String str;

public void setString(String s){
str = s;

}

public String getString(){
return str ;

}
public void setNext(Node n){
 next = n;

}

public Node getNext(){
return  next;

}

public void setPrev(Node n){
 prev = n;

}
public Node getPrev(){
return  prev;

}


}


public class DLL{


Node header , trailer;

 DLL(){
header = new Node();
trailer = new Node();
//header=null;

//header=trailer;
//trailer=header;
header.setNext(trailer);
trailer.setPrev(header);
header.setPrev(null);
trailer.setNext(null);
}




public void  insertWordB(String s  ){
Node p = new Node();
p.setString(s);

if(header.getNext()==trailer){
p.setNext(trailer);
p.setPrev(header);
header.setNext(p);
trailer.setPrev(p);

}

else{
Node q; 
q=header.getNext();

p.setNext(q);
p.setPrev(header);
header.setNext(p);
q.setPrev(p);
}

}

public void  insertWordL(String s  ){
Node p = new Node();
p.setString(s);

if(header.getNext()==trailer){
p.setNext(trailer);
p.setPrev(header);
header.setNext(p);
trailer.setPrev(p);

}

else{
Node q ;
q=trailer.getPrev();

p.setNext(trailer);
p.setPrev(q);
trailer.setPrev(p);
q.setNext(p);
}

}

public void  insertWordAnyPos(String s ,int pos ){
Node p = new Node();
p.setString(s);

if(header.getNext()==trailer){
p.setNext(trailer);
p.setPrev(header);
header.setNext(p);
trailer.setPrev(p);

}

else{
Node q ;
q=header;
int i=0;
while(q!=trailer && i!=pos){
q=q.getNext();
i++;
}
p.setNext(q);
p.setPrev(q.getPrev());
q.getPrev().setNext(p);
q.setPrev(p);

}

}

public void  deleteWordB()  throws EmptyDoublyLinkedList{

if(header.getNext()==trailer) throw new EmptyDoublyLinkedList("its empty");

else{
    
Node q;
Node p;
q=header.getNext();
p=header.getNext().getNext();
p.setPrev(header);
header.setNext(p);
q=null;
}

}

void  deleteWordL ( )throws EmptyDoublyLinkedList {

if(header.getNext()==trailer) throw new EmptyDoublyLinkedList ("its empty");

else{
Node q;
q=trailer.getPrev();
q.getPrev().setNext(trailer);
trailer.setPrev(q.getPrev());

//q=null;


}

}

void  deleteWordatAnyPos( int pos)throws EmptyDoublyLinkedList{

if(header.getNext()==trailer) throw new EmptyDoublyLinkedList("its empty");
else{
Node q;
q=header;

int i =0;
while(q!=trailer && i!=pos){
q=q.getNext();
i++;
}

q.getPrev().setNext(q.getNext());
q.getNext().setPrev(q.getPrev());

//q=null;


}

}


void  replaceWordB ( String s)throws EmptyDoublyLinkedList{

if(header.getNext()==trailer) throw new EmptyDoublyLinkedList("its empty");

else{
header.getNext().setString(s);
}

}

void  replaceWordL ( String s)throws EmptyDoublyLinkedList{

if(header.getNext()==trailer) throw new EmptyDoublyLinkedList("its empty");

else{
trailer.getPrev().setString(s);
}

}
void  replaceWordatAnyPos ( String s , int pos)throws EmptyDoublyLinkedList{

if(header.getNext()==trailer) throw new EmptyDoublyLinkedList("its empty");

else{
Node q ;
q=header;

int i=0 ;
while(q!=trailer && i!=pos){
q=q.getNext();
i++;
}

q.setString(s);

}


}

@Override
public String toString(){
    String s = null;
    Node current=header.getNext();
    s=current.getString();
    current=current.getNext();
    while(current!=trailer){
        s+=" "+current.getString()+" ";
        current=current.getNext();
    }
    return s;
} 

public void display (){
 Node q=header.getNext();   
 while(q!=trailer){   
  System.out.print(q.getString()+" ") ;
  q=q.getNext();
}


}
}




class EmptyDoublyLinkedList extends Exception{

 EmptyDoublyLinkedList( String s){   
  System.out.println(" the text file is empty");
}
}


