package cristian_sedano.orderfood.Common;

import cristian_sedano.orderfood.Model.User;

/**
 * Created by Christian on 19/02/2018.
 */

public class Common {

    public static User currentUser;

    public static String convertCodeToStatus(String status) {

        if (status.equals("0"))
            return "Placed";
        else if (status.equals("1"))
            return "On my way";
        else
            return "Shipped";
    }
}
