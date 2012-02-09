package core;

public final class PlistLength extends common.FunctionNode {

	public static final int i_l = 0;

	public static final Class<?> childTypes[] = {common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_listLength;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PlistLength(final Object c_l) {
		this(new Object[]{c_l});
	}

	public PlistLength(final Object[] args) {
		super(args);
	}

	@Override
	public common.Lazy[] getLocalInheritedAttributes(final int key) {
		return localInheritedAttributes[key];
	}

	@Override
	public common.Lazy[] getChildInheritedAttributes(final int key) {
		return childInheritedAttributes[key];
	}

	@Override
	public common.Lazy getLocal(final int key) {
		return localAttributes[key];
	}

	@Override
	public final int getNumberOfLocalAttrs() {
		return num_local_attrs;
	}

	@Override
	public final String getNameOfLocalAttr(final int index) {
		return occurs_local[index];
	}

	@Override
	public String getName() {
		return "core:listLength";
	}

	public static Integer invoke(final Object[] args) {
		try {
		return (Integer)new Integer(((common.ConsCell)(args[i_l] = common.Util.demand(args[i_l]))).length());
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:listLength", t); }
	}
	public static final common.NodeFactory<Integer> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Integer> {

		@Override
		public Integer invoke(final Object[] args) {
			return PlistLength.invoke(args);
		}

	};
}
