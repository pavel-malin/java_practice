package com.company;

class ErrorFMsg {
    final int  OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String msgs[] = {
            "Output error",
            "Input error",
            "Out of disk space",
            "Out of range index"
    };

    String getErrorFMsg(int i) {
        if (i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Error code does not exist";
    }
}

class FinalD {
    public static void main(String[] args) {
        ErrorFMsg err = new ErrorFMsg();

        System.out.println(err.getErrorFMsg(err.OUTERR));
        System.out.println(err.getErrorFMsg(err.DISKERR));
    }
}
