package core;

public final class Pfoldl extends common.FunctionNode {

	public static final int i_f = 0;
	public static final int i_i = 1;
	public static final int i_l = 2;

	public static final Class<?> childTypes[] = {common.NodeFactory.class, Object.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_foldl;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pfoldl(final Object c_f, final Object c_i, final Object c_l) {
		this(new Object[]{c_f, c_i, c_l});
	}

	public Pfoldl(final Object[] args) {
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
		return "core:foldl";
	}

	public static Object invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pfoldl(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if null(l) then i else foldl(f, f(i, head(l)), tail(l))
		 return (Object)((((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(core.Pfoldl.i_l)})) ? ((Object)context.childAsIs(core.Pfoldl.i_i)) : ((Object)core.Pfoldl.invoke(new Object[]{context.childAsIsLazy(core.Pfoldl.i_f), new common.Closure(context) { public final Object eval() { return ((Object)((common.NodeFactory<Object>)context.childAsIs(core.Pfoldl.i_f)).invoke(new Object[]{context.childAsIsLazy(core.Pfoldl.i_i), new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.Pfoldl.i_l)})); } }})); } }, new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.Pfoldl.i_l)})); } }}))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:foldl", t); }
	}
	public static final common.NodeFactory<Object> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Object> {

		@Override
		public Object invoke(final Object[] args) {
			return Pfoldl.invoke(args);
		}

	};
}
