package core;

public final class PdirNameInFilePath extends common.FunctionNode {

	public static final int i_filePath = 0;

	public static final Class<?> childTypes[] = {common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__core_dirNameInFilePath;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PdirNameInFilePath(final Object c_filePath) {
		this(new Object[]{c_filePath});
	}

	public PdirNameInFilePath(final Object[] args) {
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
		return "core:dirNameInFilePath";
	}

	public static common.StringCatter invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PdirNameInFilePath(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if indexOfLastSlash == - 1 then filePath else substring(0, indexOfLastSlash, filePath)
		 return (common.StringCatter)((((Integer)context.localAsIs(core.Init.indexOfLastSlash__ON__core_dirNameInFilePath)).equals(Integer.valueOf(-Integer.valueOf((int)1))) ? ((common.StringCatter)context.childAsIs(core.PdirNameInFilePath.i_filePath)) : ((common.StringCatter)core.Psubstring.invoke(new Object[]{Integer.valueOf((int)0), context.localAsIsLazy(core.Init.indexOfLastSlash__ON__core_dirNameInFilePath), context.childAsIsLazy(core.PdirNameInFilePath.i_filePath)}))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:dirNameInFilePath", t); }
	}
	public static final common.NodeFactory<common.StringCatter> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.StringCatter> {

		@Override
		public common.StringCatter invoke(final Object[] args) {
			return PdirNameInFilePath.invoke(args);
		}

	};
}
