package core;

public final class Pimplode extends common.FunctionNode {

	public static final int i_sep = 0;
	public static final int i_lst = 1;

	public static final Class<?> childTypes[] = {common.StringCatter.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_implode;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pimplode(final Object c_sep, final Object c_lst) {
		this(new Object[]{c_sep, c_lst});
	}

	public Pimplode(final Object[] args) {
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
		return "core:implode";
	}

	public static common.StringCatter invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new Pimplode(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if null(lst) then "" else head(lst) ++ if null(tail(lst)) then "" else sep ++ implode(sep, tail(lst))
		 return (common.StringCatter)((((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(core.Pimplode.i_lst)})) ? (new common.StringCatter("")) : new common.StringCatter((common.StringCatter)((common.StringCatter)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.Pimplode.i_lst)})), (common.StringCatter)(((Boolean)core.Pnull.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.Pimplode.i_lst)})); } }})) ? (new common.StringCatter("")) : new common.StringCatter((common.StringCatter)((common.StringCatter)context.childAsIs(core.Pimplode.i_sep)), (common.StringCatter)((common.StringCatter)core.Pimplode.invoke(new Object[]{context.childAsIsLazy(core.Pimplode.i_sep), new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.Pimplode.i_lst)})); } }})))))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:implode", t); }
	}
	public static final common.NodeFactory<common.StringCatter> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.StringCatter> {

		@Override
		public common.StringCatter invoke(final Object[] args) {
			return Pimplode.invoke(args);
		}

	};
}
