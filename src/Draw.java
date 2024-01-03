//By including this comment, I acknowledge that this submission
//is my work, and my work alone. With no collaboration with (an)other student(s)
//I also acknowledge that I have not used any AI tools and have referenced
//by providing a web link (as a comment) any online sources I have consulted
// James Finn 22348871
public class Draw {

    public static String birthdayCake(char f, char b, int width, int height) {

        if(height < 7 || width < 13 || width%2 == 0){
            throw new IllegalArgumentException("Invalid height and widht");
        }else if(b == f){
            throw new IllegalArgumentException("Identical characters");
        }
        int middle = width/2;
        String s = "";
        //case of it its big enough for all 3 cakes
        if(height-12 >= 1){
            int ceiling = height - 12;
            for(int i = 0; i< height; i++) {

                for (int j = 0; j < width; j++) {
                    if (i >= ceiling && j == middle) {
                        s += f;
                    } else if (i >= ceiling + 3 && (j >= middle - 2 && j <= middle + 2)) {
                        s += f;
                    } else if (i >= ceiling + 6 && (j >= middle - 5 && j <= middle + 5)) {
                        s += f;
                    } else if (i >= ceiling + 9 && (j >= middle - 10 && j <= middle + 10)) {
                        s += f;
                    } else {
                        s += b;
                    }
                }
                s += "\n";
            }
        //case of it its bg enough for 2 cakes
        } else if(height-9 >= 1) {
            int ceiling = height - 9;
            for(int i = 0; i< height; i++) {

                for (int j = 0; j < width; j++) {
                    if(i >= ceiling && j == middle) {
                        s+= f;
                    } else if(i>= ceiling + 3 && (j >= middle-5 && j <= middle+5)){
                        s+=f;
                    } else if(i>= ceiling + 6 && (j >= middle-10 && j <= middle+10)){
                        s+=f;
                    } else{
                        s+=b;
                    }
                }
                s+= "\n";
            }
            //case if its big enough for only one
        }else if(height-6>1){
            int ceiling = height - 6;
            for(int i = 0; i< height; i++) {

                for (int j = 0; j < width; j++) {
                    if(i >= ceiling && j == middle) {
                        s+= f;
                    } else if(i>= ceiling + 3 && (j >= middle-10 && j <= middle+10)){
                        s+=f;
                    } else{
                        s+=b;
                    }
                }
                s+= "\n";
            }
        }


        return s.trim();

    }

    //method to develop a diamond inside another diamond pattern
    //return it as a String, do not use System.out
    public static String diamonds(char f, char b, int width, int height) {
        if(height < 9 || height > 25 || width < 9 || width > 25 || width%2 == 0 || height%2 == 0 || height!=width){
            throw new IllegalArgumentException("Invalid height and widht");
        }else if(b == f){
            throw new IllegalArgumentException("Identical characters");
        }
        String s1 = "";
        String s = "";
        StringBuilder sb = null;

        int counter1 = 0;
        int middle = height/2;

        int counter2 = -2;
        //stop half way through as its the revers on way back
        for(int i = 0; i<=middle; i++){

            for(int j = 0; j< width; j++) {
                // code to make outer 2 lines
                if(j == middle + counter1 || j == middle-counter1){
                    s+= f;
                }
                //code to make innner two line
                else if(i >1 && (j == middle + counter2 || j == middle-counter2) && i<= middle){
                    s+= f;
                }
                else {
                    s+= b;
                }

            }
            s+= "\n";
            //copies top half except for middle row
            if(i == middle-1) {
                sb = new StringBuilder(s.trim());
                s1 = s;
            }
            counter1++;
            counter2++;
        }
        //reversees top hald and adds to s
        s += sb.reverse();

        //returning an empty String for now
        //change this to your pattern
        return s;

    }
}
