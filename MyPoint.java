class MyPoint{   //Beginning of the class 'MyPoint'
    int x, y;   //Data members
    MyPoint(){   //Default constructor
        x = 0;
        y = 0;
    }
    MyPoint(int x, int y){   //Overloaded constructor
        this.x = x;
        this.y = y;
    }
    void setXY(int x, int y){   //Set x and y values
        this.x = x;
        this.y = y;
    }
    int[] getXY(){   //Return x and y in array
        int arr[] = {x, y};
        return arr;
    }
    public String toString(){   //Return point as string
        return "(" + x + ", " + y + ")";
    }
    double distance(int x, int y){   //Calculate distance
        return Math.sqrt((this.x - x) * (this.x - x) +
                         (this.y - y) * (this.y - y));
    }
}   //End of the class 'MyPoint'

class TestMyPoint{   //Beginning of the class 'TestMyPoint'
    public static void main(String args[]){   //Beginning of the main method
        MyPoint p1 = new MyPoint();   //Default constructor
        MyPoint p2 = new MyPoint(3, 4);   //Parameterized constructor
        System.out.println("Point p1: " + p1);
        System.out.println("Point p2: " + p2);
        p1.setXY(2, 5);   //Set new values
        int arr[] = p1.getXY();   //Get x and y
        System.out.println("x = " + arr[0]);
        System.out.println("y = " + arr[1]);
        System.out.println("Distance = " + p1.distance(5, 9));
    }   //End of the main method
}   //End of the class 'TestMyPoint'