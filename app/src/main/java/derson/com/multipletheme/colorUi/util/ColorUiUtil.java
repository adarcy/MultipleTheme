package derson.com.multipletheme.colorUi.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsListView;



import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import derson.com.multipletheme.colorUi.ColorUiInterface;

/**
 * Created by chengli on 15/6/10.
 */
public class ColorUiUtil {
    /**
     * 切换应用主题
     *
     * @param rootView
     */
    public static void changeTheme(View rootView, Resources.Theme theme) {
        if (rootView instanceof ColorUiInterface) {
            ((ColorUiInterface) rootView).setTheme(theme);

            if (rootView instanceof RecyclerView) {
                int count = ((RecyclerView) rootView).getChildCount();
                for (int i = 0; i < count; i++) {
                    changeTheme(((ViewGroup) rootView).getChildAt(i), theme);
                }
            } else if (rootView instanceof ViewGroup) {
                int count = ((ViewGroup) rootView).getChildCount();
                for (int i = 0; i < count; i++) {
                    changeTheme(((ViewGroup) rootView).getChildAt(i), theme);
                }
            }

            if (rootView instanceof AbsListView) {
                try {
                    Field localField = AbsListView.class.getDeclaredField("mRecycler");
                    localField.setAccessible(true);
                    Method localMethod = Class.forName("android.widget.AbsListView$RecycleBin").getDeclaredMethod("clear");
                    localMethod.setAccessible(true);
                    localMethod.invoke(localField.get(rootView));
                } catch (NoSuchFieldException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e2) {
                    e2.printStackTrace();
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                } catch (InvocationTargetException e5) {
                    e5.printStackTrace();
                }
            } else if (rootView instanceof RecyclerView) {
                try {

                    Field localField = RecyclerView.class.getDeclaredField("mRecycler");
                    localField.setAccessible(true);
                    Method localMethod = Class.forName("android.support.v7.widget.RecyclerView$Recycler").getDeclaredMethod("clear");
                    localMethod.setAccessible(true);
                    localMethod.invoke(localField.get(rootView));

                    Method localMethod1 = Class.forName("android.support.v7.widget.RecyclerView$Recycler").getDeclaredMethod("clearScrap");
                    localMethod1.setAccessible(true);
                    localMethod1.invoke(localField.get(rootView));

                    ((RecyclerView) rootView).getRecycledViewPool().clear();

                } catch (NoSuchFieldException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e2) {
                    e2.printStackTrace();
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                } catch (InvocationTargetException e5) {
                    e5.printStackTrace();
                }
            }
        } else {
            if (rootView instanceof RecyclerView) {
                int count = ((RecyclerView) rootView).getChildCount();
                for (int i = 0; i < count; i++) {
                    changeTheme(((ViewGroup) rootView).getChildAt(i), theme);
                }
            } else if (rootView instanceof ViewGroup) {
                int count = ((ViewGroup) rootView).getChildCount();
                for (int i = 0; i < count; i++) {
                    changeTheme(((ViewGroup) rootView).getChildAt(i), theme);
                }
            }

            if (rootView instanceof AbsListView) {
                try {
                    Field localField = AbsListView.class.getDeclaredField("mRecycler");
                    localField.setAccessible(true);
                    Method localMethod = Class.forName("android.widget.AbsListView$RecycleBin").getDeclaredMethod("clear");
                    localMethod.setAccessible(true);
                    localMethod.invoke(localField.get(rootView));
                } catch (NoSuchFieldException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e2) {
                    e2.printStackTrace();
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                } catch (InvocationTargetException e5) {
                    e5.printStackTrace();
                }
            } else if (rootView instanceof RecyclerView) {
                try {

                    Field localField = RecyclerView.class.getDeclaredField("mRecycler");
                    localField.setAccessible(true);
                    Method localMethod = Class.forName("android.support.v7.widget.RecyclerView$Recycler").getDeclaredMethod("clear");
                    localMethod.setAccessible(true);
                    localMethod.invoke(localField.get(rootView));

                    Method localMethod1 = Class.forName("android.support.v7.widget.RecyclerView$Recycler").getDeclaredMethod("clearScrap");
                    localMethod1.setAccessible(true);
                    localMethod1.invoke(localField.get(rootView));

                    ((RecyclerView) rootView).getRecycledViewPool().clear();

                } catch (NoSuchFieldException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e2) {
                    e2.printStackTrace();
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                } catch (InvocationTargetException e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    public static void changeThemeAndroidx(View rootView, Resources.Theme theme) {
        if (rootView instanceof ColorUiInterface) {
            ((ColorUiInterface) rootView).setTheme(theme);

            if (rootView instanceof RecyclerView) {
                int count = ((RecyclerView) rootView).getChildCount();
                for (int i = 0; i < count; i++) {
                    changeTheme(((ViewGroup) rootView).getChildAt(i), theme);
                }
            } else if (rootView instanceof ViewGroup) {
                int count = ((ViewGroup) rootView).getChildCount();
                for (int i = 0; i < count; i++) {
                    changeTheme(((ViewGroup) rootView).getChildAt(i), theme);
                }
            }

            if (rootView instanceof AbsListView) {
                try {
                    Field localField = AbsListView.class.getDeclaredField("mRecycler");
                    localField.setAccessible(true);
                    Method localMethod = Class.forName("android.widget.AbsListView$RecycleBin").getDeclaredMethod("clear");
                    localMethod.setAccessible(true);
                    localMethod.invoke(localField.get(rootView));
                } catch (NoSuchFieldException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e2) {
                    e2.printStackTrace();
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                } catch (InvocationTargetException e5) {
                    e5.printStackTrace();
                }
            } else if (rootView instanceof RecyclerView) {
                try {

                    Field localField = RecyclerView.class.getDeclaredField("mRecycler");
                    localField.setAccessible(true);
                    Method localMethod = Class.forName("androidx.recyclerview.widget.RecyclerView$Recycler").getDeclaredMethod("clear");
                    localMethod.setAccessible(true);
                    localMethod.invoke(localField.get(rootView));

                    Method localMethod1 = Class.forName("androidx.recyclerview.widget.RecyclerView$Recycler").getDeclaredMethod("clearScrap");
                    localMethod1.setAccessible(true);
                    localMethod1.invoke(localField.get(rootView));

                    ((RecyclerView) rootView).getRecycledViewPool().clear();

                } catch (NoSuchFieldException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e2) {
                    e2.printStackTrace();
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                } catch (InvocationTargetException e5) {
                    e5.printStackTrace();
                }
            }
        } else {
            if (rootView instanceof RecyclerView) {
                int count = ((RecyclerView) rootView).getChildCount();
                for (int i = 0; i < count; i++) {
                    changeTheme(((ViewGroup) rootView).getChildAt(i), theme);
                }
            } else if (rootView instanceof ViewGroup) {
                int count = ((ViewGroup) rootView).getChildCount();
                for (int i = 0; i < count; i++) {
                    changeTheme(((ViewGroup) rootView).getChildAt(i), theme);
                }
            }

            if (rootView instanceof AbsListView) {
                try {
                    Field localField = AbsListView.class.getDeclaredField("mRecycler");
                    localField.setAccessible(true);
                    Method localMethod = Class.forName("android.widget.AbsListView$RecycleBin").getDeclaredMethod("clear");
                    localMethod.setAccessible(true);
                    localMethod.invoke(localField.get(rootView));
                } catch (NoSuchFieldException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e2) {
                    e2.printStackTrace();
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                } catch (InvocationTargetException e5) {
                    e5.printStackTrace();
                }
            } else if (rootView instanceof RecyclerView) {
                try {

                    Field localField = RecyclerView.class.getDeclaredField("mRecycler");
                    localField.setAccessible(true);
                    Method localMethod = Class.forName("androidx.recyclerview.widget.RecyclerView$Recycler").getDeclaredMethod("clear");
                    localMethod.setAccessible(true);
                    localMethod.invoke(localField.get(rootView));

                    Method localMethod1 = Class.forName("androidx.recyclerview.widget.RecyclerView$Recycler").getDeclaredMethod("clearScrap");
                    localMethod1.setAccessible(true);
                    localMethod1.invoke(localField.get(rootView));

                    ((RecyclerView) rootView).getRecycledViewPool().clear();

                } catch (NoSuchFieldException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e2) {
                    e2.printStackTrace();
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                } catch (InvocationTargetException e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    /**
     * 获取attr的value值
     * @param context
     * @param attr
     * @return
     */
    public static int getValueOfColorAttr(Context context, int attr){
        TypedValue tv = new TypedValue();
        //从这里可以明显看到是从theme中提取属性值的！
        context.getTheme().resolveAttribute(attr, tv, true);
        return tv.resourceId;

    }


}
