
import java.util.*;

public class Main {

    // ** IFTS ** somma degli interi tra due numeri
    public static int SommaTraInteri(int a, int b) {
        int sum = 0;
        if (a < b) {
            for (int i = a; i <= b; i++)
                sum += i;
        } else {
            for (int i = b; i <= a; i++)
                sum += i;
        }
        return sum;
    }

    // ** IFTS ** dato un array, ritorna un nuovo array cin valori raddoppiati
    public static int[] arrayDouble(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            newArr[i] = arr[i] * 2;
        return newArr;
    }

    // ** IFTS ** dato un array di integers, ottoenere un array in cui il primo
    // elemento
// è la conta dei numeri positivi e il secondo elemento è la somma dei numeri
// negativi
    public static int[] sumPosNeg(int[] arr) {
        int[] resultInt = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                resultInt[0] += 1;
            } else {
                resultInt[1] += arr[i];
            }
        }
        return resultInt;

    }

    // ** IFTS ** dato un numero, lo moltiplica per 8 se pari e per 9 se dispari
    public static int multiplying_8_9(int a) {
        return a % 2 == 0 ? 8 * a : 9 * a;
    }

    // ** IFTS ** dato un array di integers, trova il piu piccolo
    public static int minNumber(int[] arr) {
        int resultInt = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[0]) {
                resultInt = arr[i];
            }
        }
        return resultInt;
    }

    // ** IFTS ** CODEWARS dnaToRna
    public static String dnaToRna(String dna) {
        String resultIntString = "";
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'U') {
                resultIntString = resultIntString.concat("T");
            } else {
                resultIntString = resultIntString.concat(String.valueOf(dna.charAt(i)));
            }
        }
        return resultIntString;
    }

    // ** IFTS ** CODEWARS printerError versione 1
    public static int printerError(String s) {
        int count = 0;
        String[] caratteriErrati = new String[]{"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int i = 0; i < s.length(); i++) {
            for (int u = 0; u < caratteriErrati.length; u++) {
                if (String.valueOf(s.charAt(i)).equals(caratteriErrati[u])) {
                    count += 1;
                }
            }
        }
        // return String.valueOf(count) + "/" +String.valueOf(s.length());
        return count;
    }

    // ** IFTS ** CODEWARS printerError versione 2
    public static String printerError_2(String s) {
        int count = 0;

        String caratteriErrati = "nopqrstuvwxyz";
        for (int i = 0; i < s.length(); i++) {
            for (int u = 0; u < caratteriErrati.length(); u++) {
                if (s.charAt(i) == caratteriErrati.charAt(u)) {
                    count += 1;

                }
            }
        }
        return String.valueOf(count) + "/" + String.valueOf(s.length());
        // return count;
    }

    // ** IFTS ** metodo che inverte i valori di fue variabili di tipo int, riceve
    // due int e ritorna un array di int
    public static int[] invert_Variables(int var_a, int var_b) {
        int a = var_a;
        int b = var_b;
        a = a + b;
        b = a - b;
        a = a - b;
        int[] resultIntArray = {a, b};
        return resultIntArray;
    }

    ;

    // CODEWARS MakeUpperCase
    public static String MakeUpperCase(String str) {
        return str.toUpperCase();
    }

    // CODEWARS fakeBin
    public static String fakeBin(String numberString) {
        char[] arr = numberString.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 48 && arr[i] < 53) {
                arr[i] = '0';
            } else
                arr[i] = '1';
        }
        String resultIntString = new String(arr);

        return resultIntString;
    }

    // CODEWARS Convert a Number to a String!
    public static String numberToString(int num) {
        return String.valueOf(num);
    }

    // CODEWARS Sum Arrays
    public static double sum(double[] numbers) {
        double resultInt = 0;
        for (double i : numbers)
            resultInt += i;
        return resultInt;
    }

    // CODEWARS Count by X
    public static int[] countBy(int x, int n) {
        int[] resultInt = new int[n];
        for (int i = 0; i < n; i++)
            resultInt[i] = x * (i + 1);
        return resultInt;
    }

    // CODEWARS Beginner Series #2 Clock
    public static int Past(int h, int m, int s) {
        return 1000 * s * m * h;
    }

    // CODEWARS The Feast of Many Beasts
    public static boolean feast(String beast, String dish) {
        return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);
    }

    /*
     * // CODEWARS Convert number to reversed array of digits *** versione 1 (devo
     * ancora convertire in array di char) public static char [] digitize (long n){
     * String resultInt = ""; String str = Long.toString(n); for (int i =
     * str.length(); i>0; i--){
     * resultInt+=String.valueOf(str.charAt(Math.abs(i-1))); } return
     * resultInt.toCharArray(); }
     */
    /*
     * // CODEWARS Convert number to reversed array of digits *** versione 2
     * (RITORNA UN ARRAY DI CHAR) public static char [] digitize (long n){ String
     * str = Long.toString(n); char [] resultInt = new char[str.length()]; for (int
     * i = str.length(); i>0; i--){ resultInt[i-1] =
     * str.charAt(Math.abs(i-str.length())); } return resultInt; }
     */
    /*
     * // CODEWARS Convert number to reversed array of digits *** versione 3 (OK
     * FUNZIONA) public static String digitize (long n){ String str =
     * Long.toString(n); int [] resultInt = new int [str.length()]; for (int i =
     * str.length(); i>0; i--){ resultInt[i-1] =
     * Character.getNumericValue(str.charAt(Math.abs(i-str.length()))); } return
     * Arrays.toString(resultInt); }
     */
// CODEWARS Convert number to reversed array of digits  *** (OK CORRETTO, SUBMITTED TO CW)
    public static int[] digitize(long n) {
        String str = Long.toString(n);
        int resultInt[] = new int[str.length()];
        for (int i = str.length(); i > 0; i--)
            resultInt[str.length() - i] = Character.getNumericValue(str.charAt(i - 1));
        return resultInt;
    }

    // CODEWARS Opposites Attract
    public static boolean isLove(final int flower1, final int flower2) {
        return (flower1 + flower2) % 2 != 0;
    }

    // CODEWARS
    public static int[] map(int[] arr) {
        int[] resultInt = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            resultInt[i] = arr[i] * 2;
        return resultInt;
    }

    // CODEWARS Reversed Strings
    public static String solution(String str) {
        String resultInt = "";
        for (int i = str.length(); i > 0; i--)
            resultInt += str.charAt(i - 1);
        // posso evitare di scrivere Character.toString(str.charAt(i - 1)
        // perchè concatenando con il "+" il char viene convertito automaticamente in
        // stringa
        return resultInt;
    }

    // CODEWARS String ends with?
    public static boolean solution(String str, String ending) {
        return str.lastIndexOf(ending) + ending.length() == str.length() && str.indexOf(ending) != -1;
    }

    // CODEWARS Grasshopper - Summation
    public static int summation(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

    // CODEWARS Two to One
    public static String longest(String s1, String s2) {
        String union = s1 + s2;
        String remDup = "";
        for (int i = 0; i < union.length(); i++) {
            if (remDup.indexOf(union.charAt(i)) == -1) {
                remDup += union.charAt(i);
            }
        }
        char[] arr = remDup.toCharArray();
        Arrays.sort(arr);
        String resultInt = new String(arr);
        return resultInt;
    }

    // CODEWARS Highest and Lowest
    public static String highAndLow(String numbers) {
        // ottengo un array di stringhe
        String[] arr = numbers.split(" ");

        // faccio un array di int;
        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            intArr[i] = Integer.parseInt(arr[i]);

        // faccio un array di int vuoto con due campi
        int[] resultInt = new int[]{intArr[0], intArr[0]};

        // ciclo l'array di int "intArr" e confronto i valori con il mio array resultInt
        for (int i = 0; i < intArr.length; i++) {
            resultInt[0] = intArr[i] <= resultInt[0] ? intArr[i] : resultInt[0];
            resultInt[1] = intArr[i] >= resultInt[1] ? intArr[i] : resultInt[1];
        }
        return Integer.toString(resultInt[1]) + " " + Integer.toString(resultInt[0]);
    }

    // CODEWARS Grasshopper - Grade book
    public static char getGrade(int s1, int s2, int s3) {
        int avg = (s1 + s2 + s3) / 3;
        if (avg < 60)
            return 'F';
        else if (avg < 70)
            return 'D';
        else if (avg < 80)
            return 'C';
        else if (avg < 90)
            return 'B';
        else
            return 'A';
    }

    // CODEWARS Will you make it?
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return mpg * fuelLeft >= distanceToPump;
    }

    // CODEWARS Sum without highest and lowest number
    public static int sum1(int[] numbers) {
        if (numbers == null || numbers.length <= 1)
            return 0;
        int[] sortArr = numbers;
        Arrays.sort(sortArr);
        int result = 0;
        for (int i : numbers)
            result += i;
        return result - sortArr[0] - sortArr[sortArr.length - 1];
    }

    // CODEWARS Calculate average
    public static double find_average(int[] array) {
        double sum = 0;
        for (int i : array)
            sum += i;
        return sum / array.length;
    }

// CODEWARS The highest profit wins! (versione 1, submitted to CW)
    /*
     * public static int[] minMax(int[] arr) { Arrays.sort(arr); int [] result = new
     * int[2]; result[0] = arr[0]; result[1] = arr[arr.length-1]; return result; }
     */

    // CODEWARS The highest profit wins! (versione 2)
    public static int[] minMax(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[0], arr[arr.length - 1]};
    }

    // CODEWARS Double Char
    public static String doubleChar(String s) {
        char[] firstCharArr = s.toCharArray();
        char[] secondCharArr = new char[firstCharArr.length * 2];
        for (int i = 0; i < firstCharArr.length; i++) {
            secondCharArr[i * 2] = firstCharArr[i];
            secondCharArr[i * 2 + 1] = firstCharArr[i];
        }
        return new String(secondCharArr);
    }

    // CODEWARS Even or Odd
    public static String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    // CODEWARS Isograms
    public static boolean isIsogram(String str) {
        String upStr = str.toUpperCase();
        for (int i = 0; i < upStr.length(); i++) {
            int currentChar = upStr.charAt(i);
            for (int e = 0; e < upStr.length(); e++) {
                if (upStr.charAt(e) == currentChar && e != i)
                    return false;
            }
        }
        return true;
    }

    // CODEWARS Remove exclamation marks
    public static String removeExclamationMarks(String s) {
        String result = "";
        for (char i : s.toCharArray()) {
            result += i == '!' ? "" : String.valueOf(i);
        }
        return result;
    }

    // CODEWARS Simple multiplication
    public static int simpleMultiplication(int n) {
        return n % 2 == 0 ? n * 8 : n * 9;
    }

    // CODEWARS Find the odd int con commenti
    public static int findIt_A(int[] a) {
        // converto in Stringa di singoli (serve solo per countValori)
        String strindaDiValoriSingoli = "";
        for (int e : a) {
            if (strindaDiValoriSingoli.indexOf(String.valueOf(e)) == -1) {
                strindaDiValoriSingoli += (String.valueOf(e)) + ",";
            }
        }
        // conto quanti valori singoli ci sono
        int countValori = 0;
        for (char c : strindaDiValoriSingoli.toCharArray())
            if (c == ',')
                countValori++;

        // creo un array bidimesionale della dimensione corretta
        Integer[][] resultArray = new Integer[countValori][2];

        // *********** imposto i valori di default nell'array ** magari lo tolgo ???? **
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i][1] = 0; // questa è la quantità di cifre uguali
            resultArray[i][0] = null;
        }

        for (int arg : a) {

            // se trova arg
            boolean trovato = false;

            for (int i = 0; i < resultArray.length; i++) {

                if (resultArray[i][0] != null && arg == resultArray[i][0]) {
                    resultArray[i][1]++;
                    trovato = true;
                    break;
                }

            }

            if (!trovato) {
                for (int i = 0; i < resultArray.length; i++) {
                    if (resultArray[i][1] == 0) { /// **** magari null ????
                        resultArray[i][0] = arg;
                        resultArray[i][1]++;
                        break;
                    }

                }
            }
        }

        // ciclo l'array risultante e trovo un valore dispari nel secondo campo
        int finalResult = 0;
        for (int i = 0; i < resultArray.length; i++) {
            if (resultArray[i][1] % 2 != 0) {
                finalResult = resultArray[i][0];
            }
        }
        return finalResult;
    }

    // CODEWARS Find the odd int con commenti (submitted to CW)
    public static int findIt_B(int[] a) {
        String str = "";
        for (int e : a) {
            if (str.indexOf(String.valueOf(e)) == -1) {
                str += (String.valueOf(e)) + ",";
            }
        }
        int count = 0;
        for (char c : str.toCharArray())
            if (c == ',')
                count++;

        Integer[][] resultArray = new Integer[count][2];

        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i][1] = 0;
            resultArray[i][0] = null;
        }

        for (int arg : a) {
            boolean trovato = false;
            for (int i = 0; i < resultArray.length; i++) {
                if (resultArray[i][0] != null && arg == resultArray[i][0]) {
                    resultArray[i][1]++;
                    trovato = true;
                    break;
                }
            }

            if (!trovato) {
                for (int i = 0; i < resultArray.length; i++) {
                    if (resultArray[i][1] == 0) { /// **** magari null ????
                        resultArray[i][0] = arg;
                        resultArray[i][1]++;
                        break;
                    }
                }
            }
        }

        int finalResult = 0;
        for (int i = 0; i < resultArray.length; i++) {
            if (resultArray[i][1] % 2 != 0) {
                finalResult = resultArray[i][0];
            }
        }
        return finalResult;
    }

    // elevamento a potenza (rocorsiva) - segue metodo che chiama metodo
    public static int potenza(int base, int esponente) {
        if (esponente == 0)
            return 1;
        return base * potenza(base, esponente - 1);
    }

    // (vedi sopra) prova metodo dentro un metodo
    public static int metodoDentroMetodo(int base, int esponente) {
        return potenza(base, esponente);
    }

    // CODEWARS Binary Addition (non pubblicato perche su codewars da errore, ma qui
    // da me funziona bene,
// inoltre ho risolto utilizzando una funziojne ricorsiva)
    public static String r = "";

    public static int binaryConverter(int n) {
        r = r + n % 2;
        if (n > 1)
            return binaryConverter((int) n / 2);
        return 1;
    }

    ;

    public static String binaryAddition(int a, int b) {
        int sum = a + b;
        binaryConverter(sum);
        String result = "";
        for (int i = r.length() - 1; i >= 0; i--)
            result += r.charAt(i);
        return result;
    }

    ;

    // CODEWARS Two Sum
    public static int[] twoSum(int[] numbers, int target) {
        var result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    // FIBONACCI SERIES (iterazione)
    public static int[] fibonacciSequence(int n) {
        int[] serie = new int[n];
        serie[0] = 0;
        serie[1] = 1;
        for (int i = 2; i < serie.length; i++) {
            serie[i] = serie[i - 1] + serie[i - 2];
        }
        return serie;
    }

    // CODEWARS Square Every Digit
    public static int squareDigits(int n) {
        String str = String.valueOf(n);
        int[] arrResult = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arrResult[i] = (str.charAt(i) - '0') * (str.charAt(i) - '0');
        }
        String result = "";
        for (int i : arrResult)
            result += i;
        return Integer.parseInt(result);
    }

    // CODEWARS Vowel Count (NOT SUBMITTED perchè ho fatto piu di quanto chiedevano)
    // - vedi alternativa sotto
    public static int getCount_1(String str) {
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int j = 0; j < str.length(); j++) {
            switch (str.charAt(j)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }
        return a + e + i + o + u;
    }

    // CODEWARS Vowel Count (NOT SUBMITTED perchè ho fatto piu di quanto chiedevano)
    // - vedi alternativa sotto
    public static int getCount(String str) {
        String vowels = "aeiou";
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1)
                result++;
        }
        return result;
    }

    // esercizi vari
    public static String countBooleanRandom(int n) {
        Random x = new Random();
        int[] result = {0, 0};
        for (int i = 1; i <= n; i++) {
            if (x.nextBoolean() == true) {
                result[0]++;
            } else
                result[1]++;
        }
        return Arrays.toString(result);
    }

    /*
     * // roulette (bianco/nero) 24.12.2023 vedi file a parte // VARIABILI STATICHE:
     * public static int maxRipetizioni = 0; public static double maxPuntata = 0; //
     * MAIN: for (int i = 0; i<1000;i++){ roulette(10, "nero"); }
     * System.out.println("Massime ripetizioni: " +maxRipetizioni +
     * " Massima puntata: " + maxPuntata); public static void roulette (double
     * puntata, String rosso_nero){ Random giro = new Random(); int ripetizioni = 1;
     * String colore = ""; double puntata_ = puntata; for (;colore!=rosso_nero;){
     * colore = giro.nextBoolean() == true ? "rosso" : "nero"; ripetizioni ++;
     * puntata_=puntata_*2; maxRipetizioni = ripetizioni>maxRipetizioni ?
     * ripetizioni : maxRipetizioni; maxPuntata = maxPuntata> puntata_ ? maxPuntata
     * : puntata_; if (ripetizioni>100) break; } System.out.println("Hai puntato " +
     * puntata + " sul " + rosso_nero + ". Hai vinto dopo " + ripetizioni +
     * " giocate e la cira massima che hai puntato è di " + puntata_); }
     */

    // CODEWARS Transportation on vacation 24/12/2023
    public static int rentalCarCost(int d) {
        int result = 40 * d;
        int discount = d < 3 ? 0 : (d < 7 ? 20 : 50);
        return result - discount;
    }

    // CODEWARS Build Tower (dopo questo sono a 223)
    public static String[] towerBuilder(int nFloors) {
        String[] result = new String[nFloors];
        String floor = "*";
        for (var i = 0; i < nFloors; i++) {
            String pad = "";
            for (int j = nFloors - i - 1; j > 0; j--) {
                pad += " ";
            }
            result[i] = pad + floor + pad;
            floor += "**";

        }
        return result;
    }

    // CODEWARS Build a pile of Cubes 24.12.2023
    public static long findNb(long m) {
        long sum = 0;
        for (long i = 1; ; i++) {
            sum += i * i * i;
            if (sum > m)
                return -1;
            if (sum == m)
                return i;
        }
    }

    /*
     * // STAMPA LETTERE (main) public static void main(String[] args) { int i, j,
     * n=6; // Outer for loop for number of lines for (i = 0; i<=n; i++) { // Inner
     * for loop for logic execution for (j = 0; j<= n; j++) { // prints first
     * vertical line if ((j == 0 || i == 0 || i == n/2 || (j == 6 && i<n/2)))
     * System.out.print("*"); else System.out.print(" "); } System.out.println(); }
     * }
     */

    // CODEWARS Write Number in Expanded Form -- versione 1 -- (NOT SUBMITTED per
    // errore di compilazione)
    // (probabilmente i test che fa codewars si incasinano e si mischiano tra di
    // loro nella recursione ???)
    public class Kata {
        static String resultString = "";
        static int count = 1;

        public static String expandedForm(int num) {
            int resto = num % (10 * count);
            if (num == 0 && resto == 0) {
                String[] resultArray = resultString.split(",");
                String finalResult = "";
                for (int i = resultArray.length - 1; i >= 0; i--) {
                    finalResult += resultArray[i];
                    finalResult = i == 0 ? finalResult : finalResult + "+ ";
                }
                return finalResult;
            } else if (resto != 0) {
                resultString += resto + ",";
                count *= 10;
                return expandedForm(num - resto);
            } else {
                count *= 10;
                return expandedForm(num - resto);
            }
        }
    }

    // CODEWARS Write Number in Expanded Form -- versione 2 -- (ok questa fiunziona
    // anche su codewars)
    public static String expandedForm(int num) {
        String numToString = Integer.toString(num);
        String result = "";

        for (int i = 0; i <= numToString.length() - 1; i++) {
            if (numToString.charAt(i) != '0') {
                result += numToString.charAt(i) + "0".repeat(numToString.length() - i - 1) + " + ";
            }
        }
        return result.substring(0, result.length() - 3);
    }

    // CODEWARS Break camelCase
    public static String camelCase(String input) {
        String result = "";
        String lower = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            result = input.charAt(i) == lower.charAt(i) ? result + input.charAt(i) : result + " " + input.charAt(i);
        }
        return result;
    }

    // CODEWARS Mumbling
    public static String accum(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String currentChar = String.valueOf(s.charAt(i));
            result += currentChar.toUpperCase() + currentChar.toLowerCase().repeat(i) + "-";
        }
        return result.substring(0, result.length() - 1);
    }

    // CODEWARS Correct the mistakes of the character recognition software (versione
    // 1)
    public static String correct_1(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '5')
                result += "S";
            else if (string.charAt(i) == '0')
                result += "O";
            else if (string.charAt(i) == '1')
                result += "I";
            else
                result += string.charAt(i);
        }
        return result;
    }

    // CODEWARS Correct the mistakes of the character recognition software (versione
    // 2)
    public static String correct_2(String string) {
        return string.replace("5", "S").replace("1", "I").replace("0", "O");
    }

    // CODEWARS Convert boolean values to strings 'Yes' or 'No'.
    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }

    // CODEWARS Duplicate Encoder
    static String encode(String word) {
        String result = "";
        String lower = word.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            if (lower.indexOf(lower.charAt(i)) != lower.lastIndexOf(lower.charAt(i))) {
                result += ")";
            } else
                result += "(";
        }
        return result;
    }

    // CODEWARS Tic-Tac-Toe Checker 28/12/2023
    public static int isSolved(int[][] board) {
        // creo un array di int lineare (elimino la seconda dimensione)
        int[] linearArray = new int[9];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                linearArray[count] = board[i][j];
                count++;
            }
        }
        // spiano l'array di int in una stringa
        String linearString = "";
        for (int i : linearArray) {
            linearString += i;
        }

        // creo una lunga stringa con tutte le possibilità prese dalla stringa
        // precedente

        String longString = "";

        // aggiungo le combinazioni verticali
        for (int i = 0; i < 3; i++) {
            longString = longString + linearString.charAt(i) + linearString.charAt(3 + i) + linearString.charAt(6 + i)
                    + ",";
        }
        // aggiungo le combinazioni orizzontali
        longString = longString + linearString.substring(0, 3) + "," + linearString.substring(3, 6) + ","
                + linearString.substring(6, 9) + ",";

        // aggiungo le combinazioni diagonali
        longString = longString + linearString.charAt(0) + linearString.charAt(4) + linearString.charAt(8) + ","
                + linearString.charAt(2) + linearString.charAt(4) + linearString.charAt(6);

        // definisco una terna vincente
        String x = "111", o = "222";
        // controllo se qualcuno ha vinto cercando le stringhe vincenti nella longString
        if (longString.indexOf(x) != -1)
            return 1;
        else if (longString.indexOf(o) != -1)
            return 2;
        else if (longString.indexOf("0") != -1)
            return -1;
        return 0;

    }

    // CODEWARS Sum Strings as Numbers
    public static String sumStrings(String a, String b) {
        String tempA = a, tempB = b, resultA = "", resultB = "";
        int countA = 0, countB = 0;

        while (tempA.length() > 0) {
            if (tempA.charAt(0) == '0' && countA == 0) {
                tempA = tempA.substring(1);
            } else {
                resultA += tempA.charAt(0);
                tempA = tempA.substring(1);
                countA = 1;
            }
        }
        while (tempB.length() > 0) {
            if (tempB.charAt(0) == '0' && countB == 0) {
                tempB = tempB.substring(1);
            } else {
                resultB += tempB.charAt(0);
                tempB = tempB.substring(1);
                countB = 1;
            }
        }

        String tempResult = "";

        String shortStr = resultA.length() <= resultB.length() ? resultA : resultB;
        String longStr = resultB.length() >= resultA.length() ? resultB : resultA;

        shortStr = "0".repeat(longStr.length() - shortStr.length()) + shortStr;
        int carry = 0;

        for (int i = longStr.length() - 1; i >= 0; i--) {
            int sum = ((longStr.charAt(i) - '0') + (shortStr.charAt(i) - '0')) + carry;
            int digit = sum % 10;
            tempResult += digit;
            carry = (sum - digit) / 10;
            if (i == 0)
                tempResult = carry != 0 ? tempResult + carry : tempResult;
        }
        String result = "";
        while (tempResult.length() > 0) {
            result += tempResult.charAt(tempResult.length() - 1);
            tempResult = tempResult.substring(0, tempResult.length() - 1);
        }
        return result;
    }

    // CODEWARS Adding Big Numbers
    public static String add(String a, String b) {
        String tempA = a, tempB = b, resultA = "", resultB = "";
        int countA = 0, countB = 0;

        while (tempA.length() > 0) {
            if (tempA.charAt(0) == '0' && countA == 0) {
                tempA = tempA.substring(1);
            } else {
                resultA += tempA.charAt(0);
                tempA = tempA.substring(1);
                countA = 1;
            }
        }
        while (tempB.length() > 0) {
            if (tempB.charAt(0) == '0' && countB == 0) {
                tempB = tempB.substring(1);
            } else {
                resultB += tempB.charAt(0);
                tempB = tempB.substring(1);
                countB = 1;
            }
        }

        String tempResult = "";

        String shortStr = resultA.length() <= resultB.length() ? resultA : resultB;
        String longStr = resultB.length() >= resultA.length() ? resultB : resultA;

        shortStr = "0".repeat(longStr.length() - shortStr.length()) + shortStr;
        int carry = 0;

        for (int i = longStr.length() - 1; i >= 0; i--) {
            int sum = ((longStr.charAt(i) - '0') + (shortStr.charAt(i) - '0')) + carry;
            int digit = sum % 10;
            tempResult += digit;
            carry = (sum - digit) / 10;
            if (i == 0)
                tempResult = carry != 0 ? tempResult + carry : tempResult;
        }
        String result = "";
        while (tempResult.length() > 0) {
            result += tempResult.charAt(tempResult.length() - 1);
            tempResult = tempResult.substring(0, tempResult.length() - 1);
        }
        return result;
    }

    // codewars ??
    public static boolean check(String sentence) {
        String lower = sentence.toLowerCase();
        for (char i = 97; i <= 122; i++) {
            if (lower.indexOf(i) == -1)
                return false;
        }
        return true;
    }

    // CODEWARS Rock Paper Scissors! 29/12/2023
    public static String rps(String p1, String p2) {
        String rock = "rock", paper = "paper", scissors = "scissors";
        return p1 == rock ? (p2 == scissors ? "Player 1 won!" : (p2 == paper ? "Player 2 won!" : "Draw!"))
                : p1 == paper ? (p2 == scissors ? "Player 2 won!" : (p2 == rock ? "Player 1 won!" : "Draw!"))
                : (p2 == rock ? "Player 2 won!" : (p2 == paper ? "Player 1 won!" : "Draw!"));
    }

    // CODEWARS Credit Card Mask (version 1 con ciclo for e operatore ternario)
    public static String maskify_1(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++)
            result = (i <= str.length() - 1 && i > str.length() - 5) ? result + str.charAt(i) : result + "#";
        return result;
        // throw new UnsupportedOperationException("Unimplemented");
    }

    // CODEWARS Credit Card Mask (version 2 con ciclo while e operatore ternario)
    public static String maskify_2(String str) {
        String result = "";
        int count = 0;
        while (count != str.length()) {
            result = (count <= str.length() - 1 && count > str.length() - 5) ? result + str.charAt(count)
                    : result + "#";
            count++;
        }
        return result;
        // throw new UnsupportedOperationException("Unimplemented");
    }

    // CODEWARS Credit Card Mask (version 3 con ciclo while e if)
    public static String maskify_3(String str) {
        String result = "";
        int count = 0;
        while (count != str.length()) {
            if (count <= str.length() - 1 && count > str.length() - 5) {
                result += str.charAt(count);
            } else
                result += "#";
            count++;
        }
        return result;
        // throw new UnsupportedOperationException("Unimplemented");
    }

    // CODEWARS L1: Set Alarm
    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed && !vacation;
    }

    // **********************************************************************************************************************
// ESERCIZI VARI PER PROMOZIONE DI TIPO (dA INT A LONG PRINCIPALMENTE)

    // verifica tipo con variabile
    static String verificaTipo(int a) {
        return "int";
    }

    static String verificaTipo(long a) {
        return "long";
    }

    // verifica tipo con somma
    static String verificaSomma(int a, int b) {
        return "" + (a + b);
    }

    static String verificaSomma(long a, long b) {
        return "" + (a + b);
    }

    static String verificaSomma(int a, long b) {
        return "" + (a + b);
    }

    static String verificaSomma(long a, int b) {
        return "" + (a + b);
    }

    static void sum(int a, int b) {
        var varA = a;
        var varB = b;
        System.out.println("da a di tipo " + verificaTipo(a) + " a varA di tipo " + verificaTipo(varA));
        System.out.println("da b di tipo " + verificaTipo(b) + " a varB di tipo " + verificaTipo(varB));
        System.out.println("\n\nMi hai dato la variabile \"a\" di tipo " + verificaTipo(a)
                + " e la variabile \"b\" di tipo " + verificaTipo(b) + ".\nLa loro somma è di tipo "
                + verificaTipo(a + b) + " e il risultato della somma è " + verificaSomma(a, b) + "\n\n");
    }

    static void sum(long a, long b) {
        var varA = a;
        var varB = b;
        System.out.println("da a di tipo " + verificaTipo(a) + " a varA di tipo " + verificaTipo(varA));
        System.out.println("da b di tipo " + verificaTipo(b) + " a varB di tipo " + verificaTipo(varB));

        System.out.println("\n\nMi hai dato la variabile \"a\" di tipo " + verificaTipo(a)
                + " e la variabile \"b\" di tipo " + verificaTipo(b) + ".\nLa loro somma è di tipo "
                + verificaTipo(a + b) + " e il risultato della somma è " + verificaSomma(a, b) + "\n\n");
    }

    static void sum(int a, long b) {
        var varA = a;
        var varB = b;
        System.out.println("da a di tipo " + verificaTipo(a) + " a varA di tipo " + verificaTipo(varA));
        System.out.println("da b di tipo " + verificaTipo(b) + " a varB di tipo " + verificaTipo(varB));

        System.out.println("\n\nMi hai dato la variabile \"a\" di tipo " + verificaTipo(a)
                + " e la variabile \"b\" di tipo " + verificaTipo(b) + ".\nLa loro somma è di tipo "
                + verificaTipo(a + b) + " e il risultato della somma è " + verificaSomma(a, b) + "\n\n");
    }

    static void sum(long a, int b) {
        var varA = a;
        var varB = b;
        System.out.println("da a di tipo " + verificaTipo(a) + " a varA di tipo " + verificaTipo(varA));
        System.out.println("da b di tipo " + verificaTipo(b) + " a varB di tipo " + verificaTipo(varB));
        System.out.println("\n\nMi hai dato la variabile \"a\" di tipo " + verificaTipo(a)
                + " e la variabile \"b\" di tipo " + verificaTipo(b) + ".\nLa loro somma è di tipo "
                + verificaTipo(a + b) + " e il risultato della somma è " + verificaSomma(a, b) + "\n\n");
    }
// **********************************************************************************************************************
// **********************************************************************************************************************

    // CODEWARS Sum of positive
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = i >= 0 ? sum += i : sum;
        }
        return sum;
    }

    // CODEWARS Bouncing Balls
    public static int bouncingBall(double h, double bounce, double window) {
        if (!(h > 0 && bounce > 0 & bounce < 1 && window < h))
            return -1;
        int count = 1;
        h *= bounce;
        while (h > window) {
            count += 2;
            h *= bounce;
        }
        return count;
    }

    // CODEWARS Keep up the hoop
    public static String hoopCount(int n) {
        return n >= 10 ? "Great, now move on to tricks" : "Keep at it until you get it";
    }

    // CODEWARS Return Negative
    public static int makeNegative(final int x) {
        return x < 0 ? x : -x;
    }

    // CODEWARS Return 1, 2, 3 randomly
    public static int oneTwo() {
        return (int) Math.floor(Math.random() * 2) + 1;
    }

    public static int oneTwoThree() {
        int x = oneTwo() + 2 * oneTwo();
        return x == 6 ? oneTwoThree() : x - 2;
    }

// CODEWARS Bonuses  failed :(

    // CODEWARS Exes and Ohs
    public static boolean getXO(String str) {
        int countX = 0, countO = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x')
                countX++;
            if (str.charAt(i) == 'o')
                countO++;
        }
        return countO == countX;
    }

    // CODEWARS Find Maximum and Minimum Values of a List
    public int min(int[] list) {
        int min = list[0];
        for (int i = 0; i < list.length; i++)
            min = list[i] < min ? list[i] : min;
        return min;
    }

    public int max(int[] list) {
        int max = list[0];
        for (int i = 0; i < list.length; i++)
            max = list[i] > max ? list[i] : max;
        return max;
    }

    // CODEWARS Find the unique number
    public static double findUniq(double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] != arr[i]) {
                if (i == arr.length - 2 || arr[i + 1] != arr[i + 2]) {
                    return arr[i + 1];
                } else
                    return arr[i];
            }
        }
        return 0.0;
    }

    // CODEWARS Mexican Wave
    public static String[] wave(String str) {
        // conto quanti elementi deve avere l'array finale
        // lunghezza di tutte le parole meno gli spazi vuoti
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                count++;
        }
        // ora count è definito come tutte le string che devo inserire nell'array di
        // result
        String[] result = new String[count];
        int countResult = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                continue;
            result[countResult] = str.substring(0, i) + Character.toUpperCase(str.charAt(i))
                    + str.substring(i + 1, str.length());
            countResult++;
        }
        return result;
    }

    // metodo per fare System.out.println di un array di stringhe
    public static void printArray(long[] a) {
        System.out.println(Arrays.toString(a));
    }

    // CODEWARS Sum of odd numbers (VERSIONE CLEVER) 10/01/2024
    public static int rowSumOddNumbers1(int n) {
        return (int) Math.pow(n, 3);
    }

    // CODEWARS Sum of odd numbers (VERSIONE LUNGA con sistema diverso)
// vari metodi da includere in un'unica classe
    // 1) trovo x (x è il valore che, sommato al numero di riga "n", mi dice da che
    // dispari partire
    public static int findX(int n) {
        int x = 0;
        if (n != 1) {
            int sum = 0;
            for (int i = 2; i <= n; i++) {
                x += sum;
                sum++;
            }
        }
        return x;
    }

    // 2) genero un array di numeri dispari da 1 a 2n+x-1
    public static int[] odd(int n, int x) {
        int[] result = new int[2 * n + x - 1];
        int init = 1;
        for (int i = 0; i < result.length; i++) {
            result[i] = init;
            init += 2;
        }
        return result;
    }

    // 3) scrivo la funzione vera e propria
    public static int rowSumOddNumbers2(int n) {
        int x = findX(n);
        int[] arr = odd(n, x);
        int sum = 0;
        for (int i = arr.length - 1; i >= arr.length - n; i--)
            sum += arr[i];
        return sum;
    }

    // CODEWARS Take a Number And Sum Its Digits Raised To The Consecutive Powers
    // And ....¡Eureka!!
    // (divisa in due metodi)
    // 1) METODO CHE VERIFICA SE UN LONG SODDISFA LA CONDIZIONE
    public static boolean check(long a) {
        // converto il long in stringa
        String str = Long.toString(a);
        // converto la stringa in array di stringhe
        String[] strArr = str.split("");
        // converto l'array di stringhe in array di long
        Long[] longArr = new Long[strArr.length];
        for (int i = 0; i < longArr.length; i++) {
            longArr[i] = Long.parseLong(strArr[i]);
        }
        // trovo il risultato che cerco, ossia primo long elevato a 1, secondo long
        // elevato a 2 ecc...
        long result = 0, exp = 1;
        for (int i = 0; i < longArr.length; i++) {
            result += (long) Math.pow(longArr[i], exp);
            exp++;
        }
        return result == a;
    }

    // 2) METODO CHE UTILIZZA LA FUNZIONE "check" SU UN RANGE DI LONG
    public static long[] sumDigPow(long a, long b) {
        int length = 0;
        for (long i = a; i <= b; i++) {
            if (check(i))
                length++;
        }
        long[] result = new long[length];
        int pos = 0;
        for (long i = a; i <= b; i++) {
            if (check(i)) {
                result[pos] = i;
                pos++;
            }
        }
        return result;
    }

    // CODEWARS Grasshopper - Personalized Message
    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }

    // CODEWARS Find the next perfect square!
    public static long findNextSquare(long sq) {
        long n = (long) Math.sqrt(sq);
        long result = sq == n * n ? (n + 1) * (n + 1) : -1;
        return result;
    }

    // CODEWARS Powers of 2
    public static long[] powersOfTwo(int n) {
        long[] result = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = (long) Math.pow(2, i);
        }
        return result;
    }

    // CODEWARS Who likes it?
    public static String whoLikesIt(String... names) {
        if (names.length == 0)
            return "no one likes this";
        if (names.length == 1)
            return names[0] + " likes this";
        if (names.length == 2)
            return names[0] + " and " + names[1] + " like this";
        if (names.length == 3)
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        if (names.length > 3)
            return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        else
            return "";
    }

    // CODEWARS Convert a String to a Number! (without Integer)
    public static int stringToNumber(String str) {
        int result = 0;
        int count = str.charAt(0) == '-' ? -1 : 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '-')
                break;
            result += Character.getNumericValue(str.charAt(i)) * count;
            count *= 10;
        }
        return result;
    }

    // CODEWARS Breaking chocolate problem (prove varie con recursion) 15/01/2024
    static long countN = 1, countM = 1;

    public static long breakChocolateRecursion(long a) {
        if (a == 1)
            return countM;
        countM++;
        return breakChocolateRecursion(a - 1);
    }

    public static long breakChocolateRecursion2(long a, long b) {
        return 0;
    }

    public static long breakChocolate_r(long n, long m) {
        if (n == 1 && m == 1)
            return 0;
        else if (n == 1)
            return breakChocolateRecursion(m - 1);
        else if (m == 1)
            return breakChocolateRecursion(n - 1);
        else
            return (n - 1) + (m - 1) * n;
    }

    // CODEWARS Breaking chocolate problem (submitted to Codewars)
    public static long breakChocolate_old(long n, long m) {
        if (n == 1 && m == 1)
            return 0;
        else if (n == 1)
            return m - 1;
        else if (m == 1)
            return n - 1;
        else
            return (n - 1) + (m - 1) * n;
    }

    // CODEWARS Breaking chocolate problem (short version, submitted to Codewars)
    public static long breakChocolate(long n, long m) {
        return (n - 1) + (m - 1) * n;
    }

    // CODEWARS Count the divisors of a number
    public static long numberOfDivisors(int n) {
        int result = 1;
        for (int i = n / 2; i >= 1; i--) {
            if (n % i == 0)
                result++;
        }
        return (long) result;
    }

    // CODEWARS Convert a Boolean to a String
    public static String convert(boolean b) {
        return b ? "true" : "false";
    }

    // CODEWARS Sort the odd (16/01/2023 - sono a 468)
    public static int[] sortArray(int[] array) {
        // conto i dispari e creo array
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                countOdd++;
        }
        int[] oddArray = new int[countOdd];
        countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddArray[countOdd] = array[i];
                countOdd++;
            }
        }
        // ordino l'array di odd
        Arrays.sort(oddArray);
        countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = oddArray[countOdd];
                countOdd++;
            }
        }
        return array;
    }

    // CODEWARS Counting Duplicates da rifare ****** funziona a metà, nel senso che
    // se un carattere è ripetuto
    // piu di una volta viene contato piu volte
    public static int duplicateCount_(String text) {
        String lower = text.toLowerCase();
        int count = 0;
        for (int i = 0; i < lower.length(); i++) {
            if (lower.substring(i + 1).contains(Character.toString((lower.charAt(i))))) {
                count++;
            }
        }
        return count;
    }

    // CODEWARS Counting Duplicates (versione corretta)
    public static int duplicateCount(String text) {
        String lower = text.toLowerCase();
        int count = 0;
        String found = "";
        for (int i = 0; i < lower.length(); i++) {
            if ((lower.substring(i + 1).contains(Character.toString((lower.charAt(i)))))
                    && !(found.contains(Character.toString((lower.charAt(i)))))) {
                count++;
                found += Character.toString((lower.charAt(i)));
            }
        }
        return count;
    }

    // CODEWARS The Supermarket Queue
    // METODO 1 (tova il piu piccolo in un array)
    public static int smaller(int[] x) {
        int result = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] < result)
                result = x[i];
        }
        return result;
    }

    // METODO 2 (trova il max degli elementi di un array)
    public static int bigger(int[] x) {
        int result = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > result)
                result = x[i];
        }
        return result;
    }

    // METODO 3 (indexOf su array di int)
    public static int indexOfArray(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
        if (customers.length == 0)
            return 0;
        // creo array queue di dimensioni n
        int[] queue = new int[n];
        /* popolo array queue con i primi "n" customers */
        for (int i = 0; i < n; i++) {
            if (i == customers.length)
                break;
            queue[i] = customers[i];
        }
        int prox = n;

        while (prox < customers.length) {
            int min = smaller(queue);
            int index = indexOfArray(queue, min);
            queue[index] += customers[prox];
            prox++;
        }
        return bigger(queue);
    }

    // CODEWARS Tribonacci Sequence DA FINIRE
    public static double[] tribonacci(double[] s, int n) {
        double[] result = new double[n];
        for (int i = 0; i < n; i++) {
            if (i > 2)
                break;

            result[i] = s[i];
        }
        if (n == 0)
            return new double[]{};
        if (n == 1)
            return new double[]{s[0]};
        if (n == 2)
            return new double[]{s[0], s[1]};
        if (n == 3)
            return new double[]{s[0], s[1], s[2]};
        if (n == 3)
            return result;
        else {
            for (int i = 3; i <= n - 1; i++) {
                result[i] = (result[i - 1] + result[i - 2] + result[i - 3]);
            }
        }
        return result;
    }

    // CODEWARS Make a function that does arithmetic!
    public static int arithmetic(int a, int b, String operator) {

        switch (operator) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "divide":
                return a / b;
            case "multiply":
                return a * b;
            default:
                return 0;

        }
    }

    // CODEWARS Round up to the next multiple of 5
    public static int roundToNext5(int number) {
        return number % 5 != 0 ? number < 0 ? number + (-(number % 5)) : number + (5 - number % 5) : number;
    }

    // CODEWARS Simple Encryption #1 - Alternating Split
    public static String encrypt(final String text, final int n) {
        if ((text == null) || (text == "") || (n < 0))
            return text;
        String tx = text;
        String encrypted = "";
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < tx.length(); j += 2) {
                encrypted += tx.charAt(j);
            }
            for (int j = 0; j < tx.length(); j += 2) {
                encrypted += tx.charAt(j);
            }
            tx = encrypted;
            encrypted = "";
        }
        return tx;
    }

    public static String decrypt(final String encryptedText, final int n) {
        if ((encryptedText == null) || (encryptedText == "") || (n < 0))
            return encryptedText;
        String tx = encryptedText;
        String decrypted = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < tx.length() / 2; j++) {
                decrypted += tx.charAt(tx.length() / 2 + j) + Character.toString(tx.charAt(j));
            }
            tx = (decrypted.length() == encryptedText.length()) ? decrypted : decrypted + tx.charAt(tx.length() - 1);
            decrypted = "";
        }
        return tx;
    }

    // CODEWARS Exclamation multiplearks series #11: Replace all vowel to
    // exclamation mark in the sentence
    public static String replace(final String s) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(Character.toString(s.charAt(i)))) {
                result.append('!');
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    // CODEWARS Twice as old (fatta ricorsiva)
    public static int years = -1;

    public static int TwiceAsOld(int dadYears, int sonYears) {
        if (sonYears == 0)
            return dadYears;
        years++;

        if (dadYears / sonYears == 2 && dadYears % sonYears == 0)
            return years;
        else if (dadYears - sonYears < sonYears)
            return TwiceAsOld(dadYears + 1, sonYears);
        else {
            return TwiceAsOld(dadYears - 1, sonYears);
        }
    }

    // CODEWARS All Star Code Challenge #18
    public static int strCount(String str, char letter) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter)
                result++;
        }
        return result;
    }

    // CODEWARS Vowel remover
    public static String shortcut(String input) {
        String vowels = "aeiou";
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) < 0) {
                result += input.charAt(i);
            }
        }
        return result;
    }

    // CODEWARS Counting sheep...
    // VOLEVO PROVARE A GIOCARE CON ARRAYS.sort ma per qualche motivo non funziona
    // bene....
    public static int countSheeps_1(Boolean[] arrayOfSheeps) {
        Arrays.sort(arrayOfSheeps);
        for (int i = 1; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != arrayOfSheeps[i - 1]) {
                return arrayOfSheeps.length - i;
            }
        }
        return 0;
    }

    // CODEWARS Counting sheep...
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] == null)
                continue;
            if (arrayOfSheeps[i])
                count++;
        }
        return count;
    }

    // CODEWARS Tortoise racing (a me funziona ma non su codewars, provo a farlo in
    // modo diverso...)
    public static int[] race_1(int v1, int v2, int g) {
        double vv1 = (double) v1;
        double vv2 = (double) v2;
        double gg = (double) g;

        double tot = gg / (vv2 - vv1);
        int hours = (int) tot;
        int minutes = (int) (60 * ((double) tot - (double) hours));
        int seconds = (int) Math.round(60 * (60 * ((double) tot - (double) hours) - (double) minutes));
        return new int[]{hours, minutes, seconds};
    }

    // CODEWARS Tortoise racing (COSI NON FUNZIONA)
    public static int[] race(int v1, int v2, int g) {
        double v1Sec = (double) (v1 * 3600);
        double v2Sec = (double) (v2 * 3600);
        double kmG = (double) g * 3600;

        double totSeconds = kmG / (v2Sec - v1Sec) * 3600;

        int hours = (int) (totSeconds % 86400) / 3600;
        int minutes = (int) (totSeconds % 86400 % 3600) / 60;
        int seconds = (int) totSeconds % 86400 % 3600 % 60;

        return new int[]{hours, minutes, seconds};
    }

    // CODEWARS Consecutive strings
    public static String longestConsec(String[] strarr, int k) {
        if ((strarr.length == 0) || (k > strarr.length) || (k <= 0)) {
            return "";
        }
        int arr[] = new int[strarr.length - k + 1];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < k; j++) {
                arr[i] += strarr[i + j].length();
            }
        }
        int sorted[] = new int[arr.length];
        sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);

        int bigger = sorted[sorted.length - 1];

        for (int i = 0; i < sorted.length; i++) {
            String result = "";
            for (int j = 0; j < k; j++) {
                result += strarr[i + j];
            }
            if (result.length() == bigger) {
                return result;
            }
        }
        return "";
    }

    // CODEWARS Flatten and sort an array
    public static int[] flattenAndSort(int[][] array) {
        int count = 0;
        for (int[] i : array) {
            count += i.length;
        }

        int[] arr = new int[count];
        int index = 0;

        for (int i[] : array) {
            for (int j : i) {
                arr[index] = j;
                index++;
            }
        }
        Arrays.sort(arr);
        return arr;
    }

    // CODEWARS String incrementer
    public static String incrementString(String str) {
        long index = -1;
        if (str.equals("")) return "1";
        for (long i = str.length() - 1; i >= 0; i--) {
            if (!((str.charAt((int) i) >= '0') && (str.charAt((int) i) <= '9'))) {
                if (i == str.length() - 1) return str + "1";
                index = i + 1;
                break;
            }
        }
        if (index == -1)
            return "" + (Long.parseLong(str) + 1);

        String numString1 = str.substring((int) index);
        long number = Long.parseLong(numString1);
        number++;
        String numString2 = Long.toString(number);
        while (numString2.length() < numString1.length()) {
            numString2 = "0" + numString2;
        }
        return str.substring(0, (int) index) + numString2;
    }

    // ***IFTS*** metodo che continua a chiederti di inserire un numero se inserisci stringhe o pezzi di stringa
    public static void test() {
        Scanner in = new Scanner(System.in);
        String input = "";
        boolean check = true;
        do {
            System.out.println("Inserisci un numero:");
            input = in.nextLine();
            check = false;
            for (int i = 0; i < input.length(); i++) {
                if (!((input.charAt(i) >= '0') && (input.charAt(i) <= '9'))) {
                    check = true;
                }
            }
            System.out.println("Input non valido");

        } while (check == true);

        System.out.println("Hai inserito " + input);
    }

    // CODEWARS Factorial
    public static int factorial(int n) {
        if (n == 1) return n;
        else return n * factorial(n - 1);
    }

    // CODEWARS Welcome to the City
    public static String sayHello(String[] name, String city, String state) {
        String first = "";
        for (int i = 0; i < name.length - 1; i++) {
            first += name[i] + " ";
        }
        first += (name[name.length - 1] + "!");
        return "Hello, " + first + " Welcome to " + city + ", " + state + "!";
    }

    // CODEWARS Deodorant Evaporator
    public static int evaporator(double content, double evap_per_day, double threshold) {
        double noUseful = content / 100 * threshold;
        int days = 0;
        while (content > noUseful) {
            content = content - content / 100 * evap_per_day;
            days++;
        }
        return days;
    }

    // CODEWARS Highest Scoring Word 28/01/2024
    public static String high(String s) {
        int ascOffset = 9;
        String[] arr = s.split(" ");
        int[] scores = new int[arr.length];
        int count = 0;
        for (String a : arr) {
            for (int i = 0; i < a.length(); i++) {
                scores[count] += Character.getNumericValue(a.charAt(i)) - ascOffset;
            }
            count++;
        }
        int[] sorted = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sorted);

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == sorted[sorted.length - 1]) {
                return arr[i];
            }
        }
        return "";
    }

    // CODEWARS Find the stray number
    static int stray(int[] numbers) {
        int target = 0;
        for (int i = 0; i < numbers.length; i++) {
            target ^= numbers[i];
        }
        return target;
    }

    // CODEWARS Equal Sides Of An Array
    public static int findEvenIndex(int[] arr) {
        int totSum = 0;
        int firstSum = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            totSum += arr[i];
        }
        while ((index < arr.length) && (firstSum != (totSum - firstSum - arr[index]))) {

            firstSum += arr[index];
            index++;
        }
        if ((index < arr.length) && (firstSum == totSum - firstSum - arr[index])) {
            return index;
        }
        return -1;
    }

    // CODEWARS Your order, please
    public static String order(String words) {
        if (words.equals("")) return "";
        String[] arr = words.split(" ");
        String result = "";
        for (char i = '1'; i <= '9'; i++) {
            for (String s : arr) {
                if (s.contains(Character.toString(i))) result += (s + " ");
            }
        }
        return result.substring(0, result.length() - 1);
    }

    // CODEWARS Delete occurrences of an element if it occurs more than n times
    // rifatta dopo senza Arraylist
    public static ArrayList<Integer> deleteNth_(int[] elements, int maxOccurrences) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < elements.length; i++) {
            if (Collections.frequency(result, elements[i]) >= maxOccurrences)
                continue;
            else result.add(elements[i]);
        }
        return result;
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        //cicla l'array
        // prende un valore
        return null;
    }

    // CODEWARS Sum of Intervals   -   rifatto dopo piu sempolice 18/02/2024
    public static int sumIntervals1(int[][] intervals) {
        // riduco l'aarray di input in modo da considerare l'overlapping
        // creo un array di array sovradimensionato
        if (intervals.length == 0) return 0;
        int[][] resultArray = new int[intervals.length][2];
        resultArray[0] = intervals[0];
        int position = 1;
        outerloop:
        for (int[] originaleInternal : intervals) {
            innerloop:
            for (int[] termine : resultArray) {
                // valuta il primo elemento se è compreso nell'intervallo
                if (originaleInternal[0] >= termine[0] && originaleInternal[0] <= termine[1]) {
                    // TRUE1 - IL PRIMO VALORE STA IN MEZZO
                    // ora valuta se il SECONDO VALORE è compreso nell'intervallo
                    if (originaleInternal[1] <= termine[1])
                        // TRUE 2
                        // ANCHE IL SECONDO VALORE STA IN MEZZO, questo intervallo si può ignorare e passare all'intervallo successivo
                        // (trovare il modo di ritornare al primo for)
                        continue outerloop;
                        // FALSE 2 - il secondo valore è fuori dal termine, per cui occorre AGGIORNARE TERMINE
                    else {
                        termine[1] = originaleInternal[1]; // trasformo l'array resultArray
                        continue outerloop;
                    }
                } else {
                    // FALSE1 - il primo valore non è compreso
                    // QUINDI VALUTA IL SECONDO VALORE
                    if (originaleInternal[1] >= termine[0] && originaleInternal[1] <= termine[1]) {
                        // TRUE 2 - IL SECONDO VALORE e' COMPRESO, quindi aggiorna l'array dal 1 al secondo valore e torna all'outerloop (forse ci tornava senza bisogno del "continue"
                        termine[0] = originaleInternal[0];
                        continue outerloop;
                    }    // else NON SERVE !?!?!
                    // FALSE 2 - a questo punto registra originalInternal nella posizione successiva di resultArrayo
                    // ATTENZIONE, ORA CHE E' FALSE-FALSE, PRIMA DI REGISTRARE DEVE VEDERE COME STANNO MESSI GLI ALTRI TERMINI DI ARRAYRESULT
                    // NON PUOI REGISTRARE QUI MA SOLO ANDARE AVANTI...
                }
            }//fine for interno
            resultArray[position] = originaleInternal;
            position++;
        }// fine for esterno
        // ora ho l'array a posto e posso far le somme
        int sum = 0;
        for (int[] field : resultArray) {
            sum += (field[1] - field[0]);
        }
        return sum;
    }


    // CODEWARS Sum of Intervals
    public static int sumIntervals(int[][] intervals) {
        ArrayList<int[]> result = new ArrayList<>();
        for (int[] i : intervals) {
            result.add(i);
        }
        while (checkMultipleSovrapposizioni(result)) {
            int[] zero = new int[]{0, 0};
            extLoop:
            for (int i = result.size() - 1; i > 0; i--) {
                for (int j = i - 1; j >= 0; j--) {
                    int[] a = result.get(i);
                    int[] b = result.get(j);
                    if (checkSovrapposizione(a, b)) {
                        result.set(Integer.valueOf(i), unionMinMax(a, b));
                        result.remove(j);
                        continue extLoop;
                    }
                }
            }
        }
        return sumArrayList(result);
    }

    public static boolean checkSovrapposizione(int[] a, int[] b) {
        return ((a[0] >= b[0] && a[0] <= b[1]) || (a[1] >= b[0] && a[1] <= b[1]))
                || ((b[0] >= a[0] && b[0] <= a[1]) || (b[1] >= a[0] && b[1] <= a[1]));
    }

    public static boolean checkMultipleSovrapposizioni(List<int[]> a) {
        boolean result = false;
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = i + 1; j < a.size(); j++) {
                result = result || checkSovrapposizione(a.get(i), a.get(j));
            }
        }
        return result;
    }

    public static int[] unionMinMax(int[] a, int[] b) {
        int[] result;
        result = new int[]{Math.min(a[0], b[0]), Math.max(a[1], b[1])};
        return result;
    }

    public static int sumArrayList(List<int[]> a) {
        int sum = 0;
        for (int[] i : a) {
            sum += i[1] - i[0];
        }
        return sum;
    }


    // CODEWARS Find the first non-consecutive number
    static Integer find(final int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] != 1) return array[i];
        }
        return null;
    }

    // CODEWARS Sum without highest and lowest number
    public static int sum__(int[] numbers) {
        if ((numbers.length < 3) || (numbers == null)) return 0;
        Arrays.sort(numbers);
        int sum = 0;
        for (int i = 1; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    // CODEWARS The Wide-Mouthed frog!
    public static String mouthSize(String animal) {
        if (animal.equalsIgnoreCase("alligator"))
            return "small";
        return "wide";
    }

    // CODEWARS Century From Year
    public static int century(int number) {
        return number % 100 == 0 ? number / 100 : number / 100 + 1;
    }

    // CODEWARS Lario and Muigi Pipe Problem
    public static int[] pipeFix(int[] numbers) {
        int size = numbers[numbers.length - 1] - numbers[0] +1;
        int[] result = new int[size];
        result[0] = numbers[0];
        for (int i = 1; i < size; i++) {
            result[i] = result[i - 1] + 1;
        }
        return result;
    }



    // ************************ * * M A I N * * * * M A I N * * * * M A I N * *********************************
    public static void main(String... args) {


    }

}
