import java.util.*;

public class Main {

    // Task 1: Bird hierarchy
    abstract static class Bird { abstract void fly(); }
    static class Eagle extends Bird { public void fly() { System.out.println("Eagle is soaring."); } }
    static class Penguin extends Bird { public void fly() { System.out.println("Penguin cannot fly."); } }

    // Task 2: Shape area (Rectangle & Circle)
    abstract static class Shape { abstract double calculateArea(); }
    static class Rectangle extends Shape {
        double length, width;
        Rectangle(double l, double w){ length=l; width=w; }
        public double calculateArea() { return length * width; }
    }
    static class Circle extends Shape {
        double r;
        Circle(double r){ this.r=r; }
        public double calculateArea() { return Math.PI * r * r; }
    }

    // Task 3: Vehicle start/stop
    abstract static class Vehicle {
        abstract void startEngine();
        abstract void stopEngine();
    }
    static class Car extends Vehicle {
        public void startEngine() { System.out.println("Car engine started."); }
        public void stopEngine() { System.out.println("Car engine stopped."); }
    }
    static class Motorcycle extends Vehicle {
        public void startEngine() { System.out.println("Motorcycle engine started."); }
        public void stopEngine() { System.out.println("Motorcycle engine stopped."); }
    }

// Task 4: Shape2D area & perimeter (Circle2D, Rectangle2D, Triangle2D)
    abstract static class Shape2D {
        abstract double calculateArea();
        abstract double calculatePerimeter();
    }
    static class Circle2D extends Shape2D {
        double r;
        Circle2D(double r){ this.r=r; }
        public double calculateArea() { return Math.PI * r * r; }
        public double calculatePerimeter() { return 2 * Math.PI * r; }
    }
    static class Rectangle2D extends Shape2D {
        double l, w;
        Rectangle2D(double l, double w){ this.l=l; this.w=w; }
        public double calculateArea() { return l * w; }
        public double calculatePerimeter() { return 2 * (l + w); }
    }
    static class Triangle2D extends Shape2D {
        double a, b, c, height;
        Triangle2D(double a, double b, double c, double height){
            this.a=a; this.b=b; this.c=c; this.height=height;
        }
        public double calculateArea() { return 0.5 * b * height; }
        public double calculatePerimeter() { return a + b + c; }
    }

    // Task 5: 3D shapes: volume, area, perimeter
    abstract static class Draw {
        abstract double calculateVolume();
        abstract double calculateArea();
        abstract double calculatePerimeter();
    }
    static class Cube extends Draw {
        double s;
        Cube(double s){ this.s=s; }
        public double calculateVolume() { return s*s*s; }
        public double calculateArea() { return 6*s*s; }
        public double calculatePerimeter() { return 12*s; }
    }
static class Cuboid extends Draw {
        double l,w,h;
        Cuboid(double l,double w,double h){ this.l=l; this.w=w; this.h=h; }
        public double calculateVolume() { return l*w*h; }
        public double calculateArea() { return 2*(l*w+w*h+h*l); }
        public double calculatePerimeter() { return 4*(l+w+h); }
    }
    static class Cylinder extends Draw {
        double r,h;
        Cylinder(double r,double h){ this.r=r; this.h=h; }
        public double calculateVolume() { return Math.PI * r*r * h; }
        public double calculateArea() { return 2*Math.PI*r*(r+h); }
        public double calculatePerimeter() { return 2*Math.PI*r; }
    }

    // Task 6: MediaPlayer & Playlist
    interface Playlist {
        void addSong(String s);
        void removeSong(String s);
    }
    static class MediaPlayer {
        void play() { System.out.println("Playing..."); }
        void pause() { System.out.println("Paused."); }
        void stop() { System.out.println("Stopped."); }
    }
    static class VideoPlayer extends MediaPlayer implements Playlist {
        List<String> songs = new ArrayList<>();
        void rewind() { System.out.println("Rewinding"); }
        void fastForward() { System.out.println("Fast forwarding"); }
        public void addSong(String s) { songs.add(s); System.out.println("Added: "+s);}
        public void removeSong(String s) { songs.remove(s); System.out.println("Removed: "+s);}
    }
      // Task 7: Employee interface
    interface Employee {
        void work();
        double getSalary();
    }
    static class Chef implements Employee {
        public void work() { System.out.println("Chef is cooking."); }
        public double getSalary() { return 30000; }
    }
    static class Waiter implements Employee {
        public void work() { System.out.println("Waiter is serving."); }
        public double getSalary() { return 20000; }
    }

    // Task 8: LibraryItem interface
    interface LibraryItem {
        String getTitle();
        String getAuthor();
        int getYear();
        boolean isAvailable();
    }
    static class Book implements LibraryItem {
        String title, author; int year; boolean avail;
        Book(String t, String a, int y, boolean av){ title=t; author=a; year=y; avail=av; }
        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public int getYear() { return year; }
        public boolean isAvailable() { return avail; }
    }



