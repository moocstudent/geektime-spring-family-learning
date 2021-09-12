package com.example.annotationdemo.rect;

import com.example.annotationdemo.rect.annos.ToString;

@ToString
public class Rectangle {
    private Point topLeft;
    private int width;
    private int height;
    public Rectangle(Point topLeft,int width,int height){
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width) {
        this.width=width;
    }

    public Point getTopLeft(){return topLeft;}

    public int getWidth(){return width;}

    public int getHeight(){return height;}

    @ToString
    public void testAnno(){
        System.out.println("123");
    }
}
