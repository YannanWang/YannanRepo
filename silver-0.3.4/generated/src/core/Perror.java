package core;

public final class Perror extends common.FunctionNode {

	public static final int i_msg = 0;

	public static final Class<?> childTypes[] = {common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__core_error;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Perror(final Object c_msg) {
		this(new Object[]{c_msg});
	}

	public Perror(final Object[] args) {
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
		return "core:error";
	}

	public static Object invoke(final Object[] args) {
		try {
		return (Object)common.Util.error(((common.StringCatter)(args[i_msg] = common.Util.demand(args[i_msg]))).toString());
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:error", t); }
	}
	public static final common.NodeFactory<Object> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Object> {

		@Override
		public Object invoke(final Object[] args) {
			return Perror.invoke(args);
		}

	};
}
