package core;

public final class PfileTime extends common.FunctionNode {

	public static final int i_s = 0;
	public static final int i_i = 1;

	public static final Class<?> childTypes[] = {common.StringCatter.class, Object.class};

	public static final int num_local_attrs = Init.count_local__ON__core_fileTime;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PfileTime(final Object c_s, final Object c_i) {
		this(new Object[]{c_s, c_i});
	}

	public PfileTime(final Object[] args) {
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
		return "core:fileTime";
	}

	public static core.NIOVal invoke(final Object[] args) {
		try {
		return (core.NIOVal)new core.Pioval(((Object)(args[i_i] = common.Util.demand(args[i_i]))), common.Util.fileTime(((common.StringCatter)(args[i_s] = common.Util.demand(args[i_s]))).toString()));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:fileTime", t); }
	}
	public static final common.NodeFactory<core.NIOVal> factory = new Factory();

	public static final class Factory extends common.NodeFactory<core.NIOVal> {

		@Override
		public core.NIOVal invoke(final Object[] args) {
			return PfileTime.invoke(args);
		}

	};
}
