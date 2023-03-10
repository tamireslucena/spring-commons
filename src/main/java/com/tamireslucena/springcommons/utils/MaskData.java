package com.tamireslucena.springcommons.utils;

import com.tamireslucena.springcommons.enums.MaskPosition;
import com.tamireslucena.springcommons.enums.TypeOfData;


public class MaskData {

    public static String maskData(TypeOfData type, Integer maskSize, MaskPosition position, String data){
        maskSize = Math.min(maskSize, data.length());
        if(type.equals(TypeOfData.DOCUMENT)) return maskDocument(maskSize, data);
        return position.equals(MaskPosition.RIGHT) ? maskRight(maskSize, data) : maskLeft(maskSize,data);
    }

    private static String maskDocument(Integer maskSize, String data){
        if(maskSize < 6) maskSize = Math.min(6, data.length());
        return maskRight(maskSize, data);
    }

    private static String maskLeft(Integer maskSize, String data){
        Integer dataSize = data.length();
        return createMask(maskSize) + data.substring(maskSize, dataSize);
    }

    private static String maskRight(Integer maskSize, String data){
        Integer dataSize = data.length();
        return data.substring(0, dataSize - maskSize) + createMask(maskSize);
    }

    private static String createMask(Integer maskSize){
        return String.format("%" + maskSize + "s", "").replace(' ', '*');
    }

}
