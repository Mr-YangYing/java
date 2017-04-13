package collection;

/**
 * 自己实现ArrayList:可重复，默认为10的数组
 * 
 * @author Administrator
 *
 */
public class MyArrayList {

	// 声明一个Object数组
	private Object[] elementData;

	// 数组中的对象长度，默认为0
	private int size;

	// 无参构造函数，调用有参构造函数
	public MyArrayList() {
		this(10);
	}

	// 有参构造函数，默认创建一个大小为10的Object数组
	public MyArrayList(int initialCapacity) {
		if (initialCapacity < 0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.elementData = new Object[initialCapacity];
	}

	/**
	 * 得到容器中对象的长度
	 * @return
	 */
	public int size() {
		return this.size;
	}
	
	/**
	 * 判断容器是否为空
	 * @return
	 */
	public Boolean isEmpty(){
		return size==0;
	}
	
	/**
	 * 获取指定索引的元素
	 * @param index
	 * @return
	 */
	public Object get(int index) {
		if (index < 0 || index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return elementData[index];
	}

	/**
	 * 增加元素
	 * 
	 * @param obj
	 */
	public void add(Object obj) {
		// 判断长度是否超出，如果超出就需要扩容
		if (size == elementData.length) {
			// 新建一个数组，实现扩容
			Object[] newArray = new Object[size * 2 + 1];
			// 将原数组中的数据copy到这个新建的数组
			/**
			 * src:原数组 
			 * srcPos：拷贝原数组的起始位置
			 * dest：目标数组 
			 * destPos：拷贝到目标数组的起始位置
			 * length：拷贝的长度
			 * 
			 */
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			// 将新数组的引用拷贝给原数组
			elementData = newArray;
		}
		// 添加元素到容器
		elementData[size++] = obj;
	}

	/**
	 * 测试
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList();
		myArrayList.add(11);
		myArrayList.add(1);
		myArrayList.add(119);
		myArrayList.add(114);
		myArrayList.add(1199);
		myArrayList.add(11);
		System.out.println(myArrayList.size);
		System.out.println(myArrayList.get(6));
	}
}
