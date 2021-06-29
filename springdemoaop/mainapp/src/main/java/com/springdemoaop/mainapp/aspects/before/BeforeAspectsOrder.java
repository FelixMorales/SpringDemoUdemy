package com.springdemoaop.mainapp.aspects.before;

public enum BeforeAspectsOrder
{
    LOCAL_LOGGING( Constants.LOCAL_LOGGING ),
    CLOUD_LOGGING( Constants.CLOUD_LOGGING ),
    API_ANALYTICS( Constants.API_ANALYTICS );

    private final int value;

    BeforeAspectsOrder(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }

    public class Constants {
        public static final int LOCAL_LOGGING = 1;
        public static final int CLOUD_LOGGING = 2;
        public static final int API_ANALYTICS = 3;
    }
}
