com.utils/module-info.java:
module com.utils {
    exports com.utils;
}

com.utils/com/utils/StringUtils.java:
package com.utils;

public class StringUtils {
    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}

com.greetings/module-info.java:
module com.greetings {
    requires com.utils;
}

com.greetings/com/greetings/Main.java:
package com.greetings;

import com.utils.StringUtils;

public class createandUse {
    public static void main(String[] args) {
        String reversed = StringUtils.reverse("Hello, Modules!");
        System.out.println(reversed);
    }
}



