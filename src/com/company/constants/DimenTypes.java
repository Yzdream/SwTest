package com.company.constants;


public enum DimenTypes {

    //适配Android 3.2以上   大部分手机的sw值集中在  300-460之间
    DP_sw__300(300),  // values-sw300
    DP_sw__310(310),
    DP_sw__320(320),
    DP_sw__330(330),
    DP_sw__340(340),
    DP_sw__350(350),
    DP_sw__360(360),
    DP_sw__370(370),
    DP_sw__384(384),
    DP_sw__390(390),
    DP_sw__400(400),
    DP_sw__411(411),
    DP_sw__420(420),
    DP_sw__432(432),
    DP_sw__440(440),
    DP_sw__450(450),
    DP_sw__480(480),
    DP_sw__520(520),
    DP_sw__533(533),
    DP_sw__560(560),
    DP_sw__600(600);

    /**
     * 屏幕最小宽度
     */
    private int swWidthDp;


    DimenTypes(int swWidthDp) {

        this.swWidthDp = swWidthDp;
    }

    public int getSwWidthDp() {
        return swWidthDp;
    }

    public void setSwWidthDp(int swWidthDp) {
        this.swWidthDp = swWidthDp;
    }

}
