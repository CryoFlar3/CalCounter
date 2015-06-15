package util;

import java.text.DecimalFormat;

/**
 * Created by CryoFlar3 on 6/11/15.
 */
public class Utils {

    public static String formatNumber(int value){
        DecimalFormat formatter = new DecimalFormat("#,###,###");
        String formatted = formatter.format(value);

        return formatted;
    }

}
