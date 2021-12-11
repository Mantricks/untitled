package Univ.Lab8.LFC.Project;

class TestER {
    public static void main(String[] args) {
        String text = "Am o carte despre expresii regulate";
        String er = "[a-zA-Z ]*carte[a-zA-Z ]*";
        System.out.println(text.matches(er));
    }
}
