package com.penn.serializable.demo;

import com.penn.serializable.vo.Person;

import java.io.*;

/**
 * java的序列号和反序列化
 * 使用了对象流
 * 分别为对象输出流和对象输入流
 * 对象输出流把Java对象转成二进制格式的字节
 * 对象输入流把二进制格式的字节转成Java对象，正好和上面的相反
 * 我们把这个过程称之为Java的序列号和反序列号
 */

public class SerializeAndDeserializeDemo {

    public static void main(String args[])throws Exception{

        Person p = new Person();
        p.setPersonId(1000000l);
        p.setPersonName("noname123");

        System.out.println("=====初始化====");
        System.out.println(p);

        System.out.println("=====序列化====");
        serializePerson(p);

        System.out.println("=====反序列化====");
        Person p1 = deserializePerson();
        System.out.println(p1);

    }

    private static void serializePerson(Person person) throws FileNotFoundException,IOException {

        ObjectOutputStream objOutputStream = new ObjectOutputStream(new FileOutputStream(
                new File("d:\\person.txt")));
        objOutputStream.writeObject(person);

    }

    private static Person deserializePerson() throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(
                new File("d:\\person.txt")));
        Person p = (Person) objectInputStream.readObject();
        return p;
    }
}
