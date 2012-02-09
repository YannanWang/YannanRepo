package core;

public final class PfromMaybe extends common.FunctionNode {

	public static final int i_otherwise = 0;
	public static final int i_ifJust = 1;

	public static final Class<?> childTypes[] = {Object.class, core.NMaybe.class};

	public static final int num_local_attrs = Init.count_local__ON__core_fromMaybe;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_ifJust] = new common.Lazy[core.NMaybe.num_inh_attrs];
	}

	public PfromMaybe(final Object c_otherwise, final Object c_ifJust) {
		this(new Object[]{c_otherwise, c_ifJust});
	}

	public PfromMaybe(final Object[] args) {
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
		return "core:fromMaybe";
	}

	public static Object invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PfromMaybe(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if ifJust.isJust then ifJust.fromJust else otherwise
		 return (Object)((((Boolean)context.childDecorated(core.PfromMaybe.i_ifJust).synthesized(core.Init.core_isJust__ON__core_Maybe)) ? ((Object)context.childDecorated(core.PfromMaybe.i_ifJust).synthesized(core.Init.core_fromJust__ON__core_Maybe)) : ((Object)context.childAsIs(core.PfromMaybe.i_otherwise))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:fromMaybe", t); }
	}
	public static final common.NodeFactory<Object> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Object> {

		@Override
		public Object invoke(final Object[] args) {
			return PfromMaybe.invoke(args);
		}

	};
}
