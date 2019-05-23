package com.company.utils;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DpUtils {
    private static final String XML_HEADER = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n";
    private static final String XML_RESOURCE_START = "<resources>\r\n";
    private static final String XML_RESOURCE_END = "</resources>\r\n";
    private static final String XML_DIMEN_TEMPLETE = "<dimen name=\"dp_%1$d\">%2$ddp</dimen>\r\n";
    private static final String XML_DIMEN_TEMPLETE_SP = "<dimen name=\"sp_%1$d\">%2$dsp</dimen>\r\n";

    /**
     * 生成的文件名
     */
    private static final String XML_NAME = "dimens.xml";

    /**
     * 生成的目标文件夹
     * 只需传宽进来就行
     *
     * @param buildDir 生成的目标文件夹
     */
    public static void makeAll(int maxDp,int maxSp, String buildDir) {
        try {
            //生成规则
            final String folderName = "values" + maxDp + "dp";

            //生成目标目录
            File file = new File(buildDir + File.separator + folderName);
            if (!file.exists()) {
                file.mkdirs();
            }

            //生成values文件
            FileOutputStream fos = new FileOutputStream(file.getAbsolutePath() + File.separator + XML_NAME);
            fos.write(makeAllDimens(maxDp,maxSp).getBytes());
            fos.flush();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String makeAllDimens(int maxDp,int maxSp) {
        String temp;
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(XML_HEADER);
            sb.append(XML_RESOURCE_START);
            for (int i = 0; i <= maxDp; i++) {
                temp = String.format(XML_DIMEN_TEMPLETE,i,i);
                sb.append(temp);
                if (i==maxDp-1){
                    sb.append("\r\n");
                }
            }
            for (int i = 0; i <= maxSp; i++) {
                temp = String.format(XML_DIMEN_TEMPLETE_SP,i,i);
                sb.append(temp);
            }
            sb.append(XML_RESOURCE_END);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

}
