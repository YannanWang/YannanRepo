package core;

public final class PlookupBy extends common.FunctionNode {

	public static final int i_eqf = 0;
	public static final int i_elem = 1;
	public static final int i_lst = 2;

	public static final Class<?> childTypes[] = {common.NodeFactory.class, Object.class, common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__core_lookupBy;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public PlookupBy(final Object c_eqf, final Object c_elem, final Object c_lst) {
		this(new Object[]{c_eqf, c_elem, c_lst});
	}

	public PlookupBy(final Object[] args) {
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
		return "core:lookupBy";
	}

	public static core.NMaybe invoke(final Object[] args) {
		try {
		final common.DecoratedNode context = new PlookupBy(args).decorate(common.TopNode.singleton, (common.Lazy[])null);
		//if null(lst) then nothing() else if eqf(elem, head(lst).fst) then just(head(lst).snd) else lookupBy(eqf, elem, tail(lst))
		 return (core.NMaybe)((((Boolean)core.Pnull.invoke(new Object[]{context.childAsIsLazy(core.PlookupBy.i_lst)})) ? ((core.NMaybe)new core.Pnothing()) : (((Boolean)((common.NodeFactory<Boolean>)context.childAsIs(core.PlookupBy.i_eqf)).invoke(new Object[]{context.childAsIsLazy(core.PlookupBy.i_elem), new common.Closure(context) { public final Object eval() { return ((Object)((core.NPair)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PlookupBy.i_lst)})).decorate(context, (common.Lazy[])null).synthesized(core.Init.core_fst__ON__core_Pair)); } }})) ? ((core.NMaybe)new core.Pjust(new common.Closure(context) { public final Object eval() { return ((Object)((core.NPair)core.Phead.invoke(new Object[]{context.childAsIsLazy(core.PlookupBy.i_lst)})).decorate(context, (common.Lazy[])null).synthesized(core.Init.core_snd__ON__core_Pair)); } })) : ((core.NMaybe)core.PlookupBy.invoke(new Object[]{context.childAsIsLazy(core.PlookupBy.i_eqf), context.childAsIsLazy(core.PlookupBy.i_elem), new common.Closure(context) { public final Object eval() { return ((common.ConsCell)core.Ptail.invoke(new Object[]{context.childAsIsLazy(core.PlookupBy.i_lst)})); } }})))));
		} catch(Throwable t) { throw new common.exceptions.TraceException("Error while evaluating function core:lookupBy", t); }
	}
	public static final common.NodeFactory<core.NMaybe> factory = new Factory();

	public static final class Factory extends common.NodeFactory<core.NMaybe> {

		@Override
		public core.NMaybe invoke(final Object[] args) {
			return PlookupBy.invoke(args);
		}

	};
}
