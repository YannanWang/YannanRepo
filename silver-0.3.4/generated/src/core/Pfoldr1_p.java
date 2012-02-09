package core;

public final class Pfoldr1_p extends common.FunctionNode {

	public static final int i_f = 0;
	public static final int i_l = 1;

	public static final Class<?> childTypes[] = {common.NodeFactory.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_foldr1_p;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pfoldr1_p(final Object c_f, final Object c_l) {
		this(new Object[]{c_f, c_l});
	}

	public Pfoldr1_p(final Object[] args) {
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
		return "core:foldr1_p";
	}

	public static Object invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pfoldr1_p(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if null(l) then error("Applying foldr1_p to empty list.") else if length(l) == 1 then head(l) else f(head(l), foldr1_p(f, tail(l)))
		 return (Object)((((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(core.Pfoldr1_p.i_l)})) ? ((Object)core.Perror.invoke(new Object[]{(new common.StringCatter("Applying foldr1_p to empty list."))})) : (((Integer)core.PlistLength.invoke(new Object[]{context.childAsIsLazy(core.Pfoldr1_p.i_l)})).equals(Integer.valueOf((int)1)) ? ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.Pfoldr1_p.i_l)})) : ((Object)((common.NodeFactory<Object>)context.childAsIs(core.Pfoldr1_p.i_f)).invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((Object)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.Pfoldr1_p.i_l)})); } }, new common.Closure(context) { public final Object eval() { return ((Object)core.Pfoldr1_p.invoke(new Object[]{context.childAsIsLazy(core.Pfoldr1_p.i_f), new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.Pfoldr1_p.i_l)})); } }})); } }})))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:foldr1_p", t); }
	}
	public static final common.NodeFactory<Object> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Object> {

		@Override
		public Object invoke(final Object[] args) {
			return Pfoldr1_p.invoke(args);
		}

	};
}
