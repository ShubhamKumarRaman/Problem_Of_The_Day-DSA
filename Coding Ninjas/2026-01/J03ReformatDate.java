
public class J03ReformatDate {

    public static String reformatDate(String s) {
        String parts[] = s.split(" ");

        //day
        String dayStr = parts[0];
        dayStr = dayStr.substring(0, dayStr.length() - 2);
        int day = Integer.parseInt(dayStr);
        String formattedDay = (day < 10) ? "0" + day : String.valueOf(day);

        //Month
        String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int monthNum = 0;
        for (int i = 0; i < 12; i++) {
            if (monthNames[i].equals(parts[1])) {
                monthNum = i+1;
                break;
            }
        }
        String formattedMonth = (monthNum < 10) ? "0" + monthNum : String.valueOf(monthNum);

        //Year
        String formattedYear = parts[2];

        return formattedYear + "-" + formattedMonth + "-" + formattedDay;
    }

    public static void main(String args[]) {
        String s = "27th Apr 1998";
        String result = reformatDate(s);
        System.out.println(result);
    }
}
