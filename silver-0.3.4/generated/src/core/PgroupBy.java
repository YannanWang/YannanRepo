package core;

public final class PgroupBy extends common.FunctionNode {

	public static final int i_eq = 0;
	public static final int i_l = 1;

	public static final Class<?> childTypes[] = {common.NodeFactory.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_groupBy;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PgroupBy(final Object c_eq, final Object c_l) {
		this(new Object[]{c_eq, c_l});
	}

	public PgroupBy(final Object[] args) {
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
		return "core:groupBy";
	}

	public static common.ConsCell invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PgroupBy(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if null(l) then [] else (helpercall.fst :: if null(helpercall.snd) then [] else groupBy(eq, helpercall.snd))
		 return (common.ConsCell)((((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(core.PgroupBy.i_l)})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.Pcons.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((common.ConsCell)context.localDecorated(core.Init.helpercall__ON__core_groupBy).synthesized(core.Init.core_fst__ON__core_Pair)); } }, new common.Closure(context) { public final Object eval() { return (((Boolean)core.Pnull.invoke(new Object[]{new common.Closure(context) { public final Object eval() { return ((common.ConsCell)context.localDecorated(core.Init.helpercall__ON__core_groupBy).synthesized(core.Init.core_snd__ON__core_Pair)); } }})) ? ((common.ConsCell)core.Pnil.invoke(new Object[]{})) : ((common.ConsCell)core.PgroupBy.invoke(new Object[]{context.childAsIsLazy(core.PgroupBy.i_eq), new common.Closure(context) { public final Object eval() { return ((common.ConsCell)context.localDecorated(core.Init.helpercall__ON__core_groupBy).synthesized(core.Init.core_snd__ON__core_Pair)); } }}))); } }}))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:groupBy", t); }
	}
	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {

		@Override
		public common.ConsCell invoke(final Object[] args) {
			return PgroupBy.invoke(args);
		}

	};
}
