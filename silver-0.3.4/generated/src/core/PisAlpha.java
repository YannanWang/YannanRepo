package core;

public final class PisAlpha extends common.FunctionNode {

	public static final int i_str = 0;

	public static final Class<?> childTypes[] = {common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__core_isAlpha;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PisAlpha(final Object c_str) {
		this(new Object[]{c_str});
	}

	public PisAlpha(final Object[] args) {
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
		return "core:isAlpha";
	}

	public static Boolean invoke(final Object[] args) {
		try {
		return (Boolean)(common.Util.isAlpha(((common.StringCatter)(args[i_str] = common.Util.demand(args[i_str]))).toString()));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:isAlpha", t); }
	}
	public static final common.NodeFactory<Boolean> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Boolean> {

		@Override
		public Boolean invoke(final Object[] args) {
			return PisAlpha.invoke(args);
		}

	};
}
