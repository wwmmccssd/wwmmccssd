package com.learn.weik.demo;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author weikun
 * @Description TODO
 * @date 2023/01/03-9:44
 */
@Service
public class LearnStreamServiceImpl implements LearnStreamService {
    private static final List<User> USERS;

    static {
        USERS = List.of(new User("永强", 18, 1),
                new User("曲", 25, 1),
                new User("孙", 20, 0),
                new User("书佐", 25, 1),
                new User("经纬", 28, 1),
                new User("孙二", 26, 0)
        );

    }
    public LearnStreamServiceImpl getLearnStreamServiceImpl(){
        System.out.println("111");
        return new LearnStreamServiceImpl();
    }

    /**
     * stream groupBy 分组与统计
     */
    @Override
    public void streamGroupBy() {
        //根据性别分组
        //map 的 key 是我们分组的根据（就是性别） value就是我们分组的结果是一个list
        Map<Integer, List<User>> groupByGender = USERS.stream().collect(Collectors.groupingBy(User::getGender));
        System.out.println(groupByGender);

        //根据年龄分组
        Map<String, List<User>> collect = USERS.stream().collect(Collectors.groupingBy(user -> {
                    Integer age = user.getAge();
                    if (age >= 18 && age <= 20) {
                        return "18-20";

                    } else if (age >= 21 && age <= 25) {
                        return "21-25";

                    } else if (age >= 26 && age <= 30) {
                        return "26-30";

                    }
                    return "other";
                }
        ));

        //统计男女生数量
        Map<Integer, Long> countGenders = USERS.stream().collect(Collectors.groupingBy(User::getGender, Collectors.counting()));
        System.out.println("统计男女生数量:"+countGenders);
        Assert.notEmpty(countGenders,"统计男女生数量");
        String s = new String();
        Integer i = Integer.parseInt("0");

        //reduce归并
    }

    /**
     * 排序
     */
    @Override
    public void getSort(){
        //java如何排序？ comparable和comparator接口
        List<Integer> integers = new ArrayList<>(List.of(5, 9, 2, 0, 7, 4, 11));
        //自然升序
        Collections.sort(integers);
        System.out.println("Collections.sort排序:"+integers);
//        integers.sort();

        //2.构造comparator对象
        //针对java已经提供的构造
        Comparator<Integer> compareIntegers= Integer::compare;
        Comparator<CharSequence> compareChar = CharSequence::compare;

        ArrayList<User> userList = new ArrayList<>(USERS);
        //3.自定义对象排序
        Comparator<User> comparingUser = Comparator.comparing(User::getAge);
        userList.sort(comparingUser);
        System.out.println("构造器对对象排序(按照年龄升序):"+userList);
        //4.多个字段进行比较排序
        Comparator<User> userComparator = Comparator.comparing(User::getAge).thenComparing(User::getGender);
        userList.sort(userComparator);
        System.out.println("构造器按照年龄和性别进行排序："+userList);

        //5.倒序 年龄倒序(使用reversed反转)
        Comparator<User> reversed = Comparator.comparing(User::getAge).reversed();
        userList.sort(reversed);
        System.out.println("构造器年龄倒序:"+userList);

        //6.排序api
        //数据在数组里
        User[] users = userList.stream().toArray(User[]::new);
        Arrays.sort(users,comparingUser);
        System.out.println("Arrays.sort对数组进行排序:"+userList);

        //数据在list里
        Collections.sort(userList,comparingUser);

        //6.不改变原始数据进行排序
        //数组转流再排序
        Stream<User> sorted = Stream.of(users).sorted(comparingUser);
        Stream<User> sorted1 = Arrays.stream(users).sorted(comparingUser);

        Stream<User> sorted2 = USERS.stream().sorted(comparingUser);
    }

    /**
     * stream 过滤
     */
    public void testFilter(Predicate<? super User> predicate) {
        //过滤user中的男性
        List<User> mans = USERS.stream().filter(u -> u.getGender().equals(1)).collect(Collectors.toList());
        System.out.println("男性:"+mans);
        //多条件过滤
        List<User> youngMans = USERS.stream().filter(u -> u.getGender().equals(1) && u.getAge() < 25).collect(Collectors.toList());
        System.out.println("男性小于25岁："+youngMans);

        List<User> yongMans2 = USERS.stream().filter(predicate).collect(Collectors.toList());
        System.out.println("男性小于等于25岁："+yongMans2);
        String url = "我叫%s,今年%s岁。";
        String name = "阳阳";
        String age = "23";
        url = String.format(url,name,age);
        System.out.println(url);
    }

    /**
     * stream 根据性别求平均年龄
     */
    public void getMansAverageAge(){
        //1.根据性别分组 2.求出每个性别平均年龄
        Map<Integer, Double> mansAverageAgeMap = USERS.stream().collect(Collectors.groupingBy(User::getGender, Collectors.averagingInt(User::getAge)));
        mansAverageAgeMap.entrySet().forEach(System.out::println);
        //直接打印
        USERS.stream().collect(Collectors.groupingBy(User::getGender, Collectors.averagingInt(User::getAge))).forEach((k,v)-> System.out.println(k+":"+v));


    }

    /**
     * 函数式接口
     */
    static Predicate<String>
            p1 = s -> s.contains("xxx"),
            p2 = s -> s.length() < 5,
            p3 = s -> s.contains("eam"),
            p4 = s -> p1.negate().and(p2).or(p3).test(s);
    public static void testPredicate(){
        //peek作为debug用检查数据也可以做消费数据，不会对流造成影响。foreach会中断流操作变成遍历操作。map会返回一个新的流。
        Stream.of("string","stream","r","p","tt","yyyy","eam").filter(p4).peek(System.out::println).collect(Collectors.toList());
    }

    /**
     * 链接a和b
     * @param a
     * @param b
     * @return
     */
    static String connectStrings(String a, String b) {
        return a + b;

    }

    /**
     * 柯里化
     */
    public static void testCurry(){
        Function<String, Function<String, String>> sum = a -> b -> a + b;
        System.out.println(connectStrings("hi","llo"));
        //柯里化
        System.out.println(sum.apply("hi").apply("llo"));
    }

    /**
     * 获取一个长度为20的整数流
     * @return
     */
    public static IntStream getIntsStream() {
        return new Random(48).ints(2,44).distinct().limit(20).sorted().peek(System.out ::println);
    }

}
