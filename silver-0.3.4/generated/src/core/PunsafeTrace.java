package core;

public final class PunsafeTrace extends common.FunctionNode {

	public static final int i_val = 0;
	public static final int i_act = 1;

	public static final Class<?> childTypes[] = {Object.class, Object.class};

	public static final int num_local_attrs = Init.count_local__ON__core_unsafeTrace;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PunsafeTrace(final Object c_val, final Object c_act) {
		this(new Object[]{c_val, c_act});
	}

	public PunsafeTrace(final Object[] args) {
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
		return "core:unsafeTrace";
	}

	public static Object invoke(final Object[] args) {
		try {
		return (Object)(((Object)(args[i_act] = common.Util.demand(args[i_act])))==null?((Object)(args[i_val] = common.Util.demand(args[i_val]))):null);
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:unsafeTrace", t); }
	}
	public static final common.NodeFactory<Object> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Object> {

		@Override
		public Object invoke(final Object[] args) {
			return PunsafeTrace.invoke(args);
		}

	};
}
