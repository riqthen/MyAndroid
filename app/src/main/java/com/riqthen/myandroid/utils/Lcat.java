package com.riqthen.myandroid.utils;

import android.util.Log;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by riq on 2017/4/26.
 */

public class Lcat {
    private static int PRIORITY = Log.ERROR;    //默认优先级
    private static int PRIORITYD = Log.DEBUG;   //默认优先级
    public static boolean IS_DEBUG = true;      //默认显示log

    //-----------> String
    public static void e(String tag, String s) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITY, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ----> " + s);
        }
    }

    //-----------> Object
    public static void e(String tag, Object o) {
        if (IS_DEBUG) {
            try {
                String threadName = Thread.currentThread().getName();
                String lineIndicator = getLineIndicator();
                Log.println(PRIORITY, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + o.toString());
            } catch (Exception e) {
                Lcat.e("Object打印错误", e);
            }
        }
    }

    //-----------> Exception
    public static void e(String tag, Exception e) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITY, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + e.getMessage());
        }
    }


    //-----------> int
    public static void e(String tag, int i) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITY, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + i);
        }
    }

    //-----------> double
    public static void e(String tag, double d) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITY, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + d);
        }
    }


    //-----------> long
    public static void e(String tag, long l) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITY, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + l);
        }
    }

    //-----------> boolean
    public static void e(String tag, boolean b) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITY, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + b);
        }
    }

    //-----------> String[]
    public static void e(String tag, String[] strings) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITY, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + Arrays.toString(strings));
        }
    }

    //-----------> int[]
    public static void e(String tag, int[] ints) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITY, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + Arrays.toString(ints));
        }
    }

    //-----------> double[]
    public static void e(String tag, double[] doubles) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITY, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + Arrays.toString(doubles));
        }
    }

    //-----------> byte[]
    public static void e(String tag, byte[] bytes) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITY, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + Arrays.toString(bytes));
        }
    }


    //-----------> Object[]
    public static void e(String tag, Object[] objects) {
        if (IS_DEBUG) {
            try {
                String threadName = Thread.currentThread().getName();
                String lineIndicator = getLineIndicator();
                Log.println(PRIORITY, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + Arrays.toString(objects));
            } catch (Exception e) {
                Lcat.e("Object[]打印错误", e);
            }
        }
    }

    //-----------> long[]
    public static void e(String tag, Long[] longs) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITY, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + Arrays.toString(longs));
        }
    }


    //-----------> List
    public static <T> void e(String tag, List<T> list) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITY, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + String.valueOf(list));
        }
    }


    //-----------> Set
    public static <T> void e(String tag, Set<T> set) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITY, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + String.valueOf(set));
        }
    }

    //-----------> Map
    public static <K, V> void e(String tag, Map<K, V> map) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITY, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + String.valueOf(map));
        }
    }

    //-----------> String
    public static void d(String tag, String s) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITYD, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + s);
        }
    }

    //-----------> Object
    public static void d(String tag, Object o) {
        if (IS_DEBUG) {
            try {
                String threadName = Thread.currentThread().getName();
                String lineIndicator = getLineIndicator();
                Log.println(PRIORITYD, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + o.toString());
            } catch (Exception e) {
                Lcat.e("Object打印错误", e);
            }
        }
    }


    //-----------> int
    public static void d(String tag, int i) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITYD, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + i);
        }
    }

    //-----------> double
    public static void d(String tag, double d) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITYD, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + d);
        }
    }


    //-----------> long
    public static void d(String tag, long l) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITYD, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + l);
        }
    }

    //-----------> boolean
    public static void d(String tag, boolean b) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITYD, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + b);
        }
    }

    //----------->  String[]
    public static void d(String tag, String[] strings) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITYD, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + Arrays.toString(strings));
        }
    }

    //----------->  int[]
    public static void d(String tag, int[] ints) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITYD, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + Arrays.toString(ints));
        }
    }

    //----------->  double[]
    public static void d(String tag, double[] doubles) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITYD, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + Arrays.toString(doubles));
        }
    }

    //----------->  byte[]
    public static void d(String tag, byte[] bytes) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITYD, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + Arrays.toString(bytes));
        }
    }


    //----------->  Object[]
    public static void d(String tag, Object[] objects) {
        if (IS_DEBUG) {
            try {
                String threadName = Thread.currentThread().getName();
                String lineIndicator = getLineIndicator();
                Log.println(PRIORITYD, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + Arrays.toString(objects));
            } catch (Exception e) {
                Lcat.e("Object[]打印错误", e);
            }
        }
    }

    //----------->  Long[]
    public static void d(String tag, Long[] longs) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITYD, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + Arrays.toString(longs));
        }
    }


    //-----------> List
    public static <T> void d(String tag, List<T> list) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITYD, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + String.valueOf(list));
        }
    }


    //-----------> Set
    public static <T> void d(String tag, Set<T> set) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITYD, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + String.valueOf(set));
        }
    }

    //-----------> Map
    public static <K, V> void d(String tag, Map<K, V> map) {
        if (IS_DEBUG) {
            String threadName = Thread.currentThread().getName();
            String lineIndicator = getLineIndicator();
            Log.println(PRIORITYD, "." + tag, "Thread: " + threadName + "／" + lineIndicator + tag + " ---->" + String.valueOf(map));
        }
    }


    //获取行所在的方法指示
    private static String getLineIndicator() {
        //2代表方法的调用深度：0-getLineIndicator，1-performPrint，2-e
        StackTraceElement element = ((new Exception()).getStackTrace())[2];
        String packageName = element.getClassName().substring(0, element.getClassName().lastIndexOf("."));
        return packageName + "／" +
//                element.getMethodName() + "()／" +
                "(" +
                element.getFileName() + ":" +
                element.getLineNumber() + ")：";
    }
}
