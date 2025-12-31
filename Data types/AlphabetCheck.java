class AlphabetCheck {
    public static void main(String[] args) {
        char ch = 'K';

        boolean isAlphabet = 
            (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');

        if(isAlphabet)
            System.out.println(ch + " is an Alphabet");
        else
            System.out.println(ch + " is Not an Alphabet");
    }
}

