class Rect 
{ 
            int l,b; 
            void get_data(int x,int y) 
            { 
                        l=x; 
                        b=y; 
            } 
            int CalculateArea() 
            { 
                        return (l*b); 
            } 
}; 
class A 
{ 
            
            public static void main (String args[]) 
            { 
                        Rect rect = new Rect(); 
                        rect.get_data (50,8); 
                        System.out.println("Area of Rectangle is : "+rect.CalculateArea()); 
            } 
};