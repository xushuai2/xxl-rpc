package com.xxl.rpc.test;

import com.xxl.rpc.serialize.Serializer;

/**
 * @author xuxueli 2015-10-30 21:02:55
 */
public class SerializerTest {

    public static void main(String[] args) {
        Serializer serializer = Serializer.SerializeEnum.match("PROTOSTUFF", null).getSerializer();
        System.out.println(serializer);
        try {
            System.out.println(serializer.deserialize(serializer.serialize("dddddd和你电话d"), String.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
