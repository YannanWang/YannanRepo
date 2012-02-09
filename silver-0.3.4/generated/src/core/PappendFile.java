package core;

public final class PappendFile extends common.FunctionNode {

	public static final int i_file = 0;
	public static final int i_contents = 1;
	public static final int i_i = 2;

	public static final Class<?> childTypes[] = {common.StringCatter.class, common.StringCatter.class, Object.class};

	public static final int num_local_attrs = Init.count_local__ON__core_appendFile;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PappendFile(final Object c_file, final Object c_contents, final Object c_i) {
		this(new Object[]{c_file, c_contents, c_i});
	}

	public PappendFile(final Object[] args) {
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
		return "core:appendFile";
	}

	public static Object invoke(final Object[] args) {
		try {
		return (Object)common.Util.io(((Object)(args[i_i] = common.Util.demand(args[i_i]))), common.Util.appendFile(((common.StringCatter)(args[i_file] = common.Util.demand(args[i_file]))).toString(), ((common.StringCatter)(args[i_contents] = common.Util.demand(args[i_contents])))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:appendFile", t); }
	}
	public static final common.NodeFactory<Object> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Object> {

		@Override
		public Object invoke(final Object[] args) {
			return PappendFile.invoke(args);
		}

	};
}
