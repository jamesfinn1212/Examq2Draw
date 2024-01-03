import static org.junit.jupiter.api.Assertions.*;
//By including this comment, I acknowledge that this submission
//is my work, and my work alone. With no collaboration with (an)other student(s)
//I also acknowledge that I have not used any AI tools and have referenced
//by providing a web link (as a comment) any online sources I have consulted
// James Finn 22348871
class Test {

@org.junit.jupiter.api.Test
     void testCake() {
        String cake, output;

        cake = ".............................\n" +
                ".............................\n" +
                "..............x..............\n" +
                "..............x..............\n" +
                "..............x..............\n" +
                "....xxxxxxxxxxxxxxxxxxxxx....\n" +
                "....xxxxxxxxxxxxxxxxxxxxx....\n" +
                "....xxxxxxxxxxxxxxxxxxxxx....";

        output = Draw.birthdayCake('x', '.', 29, 8);
        assertEquals(cake, output.trim());

        cake = "...................................\n" +
                "...................................\n" +
                "...................................\n" +
                ".................x.................\n" +
                ".................x.................\n" +
                ".................x.................\n" +
                "............xxxxxxxxxxx............\n" +
                "............xxxxxxxxxxx............\n" +
                "............xxxxxxxxxxx............\n" +
                ".......xxxxxxxxxxxxxxxxxxxxx.......\n" +
                ".......xxxxxxxxxxxxxxxxxxxxx.......\n" +
                ".......xxxxxxxxxxxxxxxxxxxxx.......";

        output = Draw.birthdayCake('x', '.', 35, 12);
        assertEquals(cake, output.trim());

        cake = "...................................\n" +
                "...................................\n" +
                "...................................\n" +
                ".................x.................\n" +
                ".................x.................\n" +
                ".................x.................\n" +
                "...............xxxxx...............\n" +
                "...............xxxxx...............\n" +
                "...............xxxxx...............\n" +
                "............xxxxxxxxxxx............\n" +
                "............xxxxxxxxxxx............\n" +
                "............xxxxxxxxxxx............\n" +
                ".......xxxxxxxxxxxxxxxxxxxxx.......\n" +
                ".......xxxxxxxxxxxxxxxxxxxxx.......\n" +
                ".......xxxxxxxxxxxxxxxxxxxxx.......";

        output = Draw.birthdayCake('x', '.', 35, 15);
        assertEquals(cake, output.trim());
    }

    @org.junit.jupiter.api.Test
    void testDiamonds() {
        String diamond;
        String output;

        diamond = "....x....\n" +
                "...x.x...\n" +
                "..x.x.x..\n" +
                ".x.x.x.x.\n" +
                "x.x...x.x\n" +
                ".x.x.x.x.\n" +
                "..x.x.x..\n" +
                "...x.x...\n" +
                "....x....";

        output = Draw.diamonds('x', '.', 9, 9).trim();
        assertEquals(diamond, output);

        diamond = ".......x.......\n" +
                "......x.x......\n" +
                ".....x.x.x.....\n" +
                "....x.x.x.x....\n" +
                "...x.x...x.x...\n" +
                "..x.x.....x.x..\n" +
                ".x.x.......x.x.\n" +
                "x.x.........x.x\n" +
                ".x.x.......x.x.\n" +
                "..x.x.....x.x..\n" +
                "...x.x...x.x...\n" +
                "....x.x.x.x....\n" +
                ".....x.x.x.....\n" +
                "......x.x......\n" +
                ".......x.......";

        output = Draw.diamonds('x', '.', 15, 15).trim();
        assertEquals(diamond, output);

        diamond = ".........x.........\n" +
                "........x.x........\n" +
                ".......x.x.x.......\n" +
                "......x.x.x.x......\n" +
                ".....x.x...x.x.....\n" +
                "....x.x.....x.x....\n" +
                "...x.x.......x.x...\n" +
                "..x.x.........x.x..\n" +
                ".x.x...........x.x.\n" +
                "x.x.............x.x\n" +
                ".x.x...........x.x.\n" +
                "..x.x.........x.x..\n" +
                "...x.x.......x.x...\n" +
                "....x.x.....x.x....\n" +
                ".....x.x...x.x.....\n" +
                "......x.x.x.x......\n" +
                ".......x.x.x.......\n" +
                "........x.x........\n" +
                ".........x.........";

        output = Draw.diamonds('x', '.', 19, 19).trim();
        assertEquals(diamond, output);
    }

}