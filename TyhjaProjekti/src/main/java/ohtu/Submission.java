package ohtu;
public class Submission {

    private String student_number, week;
    private Boolean a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21;
    private boolean[] tehtavat = new boolean[21];
    private int tehtyjä, hours;

    private void setToArray(int arrayIndex, Boolean a) {
        if (a == null) a = false;
        tehtavat[arrayIndex] = a;
    }
    
    public int tehtyjä(){return tehtyjä;}
    public int aika(){return hours;}
    
    private void buildArray() {
        setToArray(0, a1);
        setToArray(1, a2);
        setToArray(2, a3);
        setToArray(3, a4);
        setToArray(4, a5);
        setToArray(5, a6);
        setToArray(6, a7);
        setToArray(7, a8);
        setToArray(8, a9);
        setToArray(9, a10);
        setToArray(10, a11);
        setToArray(11, a12);
        setToArray(12, a13);
        setToArray(13, a14);
        setToArray(14, a15);
        setToArray(15, a16);
        setToArray(16, a17);
        setToArray(17, a18);
        setToArray(18, a19);
        setToArray(19, a20);
        setToArray(20, a21);
    }

    @Override
    public String toString() {
        buildArray();
        String tehdyt = "";
        for (int i = 0; i < 21; i++){
            if (tehtavat[i]) {tehtyjä++;tehdyt += (i+1) + " ";}
        }
        return "Viikko " + week + ": tehtyjä tehtäviä yhteensä: " + tehtyjä + " Aikaa kului yhteensä " + hours + " Tehdyt tehtävät: " + tehdyt;
    }
}