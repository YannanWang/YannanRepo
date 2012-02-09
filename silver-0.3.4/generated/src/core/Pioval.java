package core;

// top::IOVal<a> ::= i::IO v::a 
public final class Pioval extends core.NIOVal {

	public static final int i_i = 0;
	public static final int i_v = 1;

	public static final Class<?> childTypes[] = {Object.class, Object.class};

	public static final int num_local_attrs = Init.count_local__ON__core_ioval;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[core.NIOVal.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[core.NIOVal.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Pioval(final Object c_i, final Object c_v) {
		this(new Object[]{c_i, c_v});
	}

	public Pioval(final Object[] args) {
		super(args);
	}

	@Override
	public common.Lazy getSynthesized(final int index) {
		return synthesizedAttributes[index];
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
	public common.Node getForward(final common.DecoratedNode context) {
		return null;
	}

	@Override
	public common.Lazy getForwardInheritedAttributes(final int index) {
		return forwardInheritedAttributes[index];
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
		return "core:ioval";
	}

	static void initProductionAttributeDefinitions() {
		// top.io = i
		core.Pioval.synthesizedAttributes[core.Init.core_io__ON__core_IOVal] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Object)context.childAsIs(core.Pioval.i_i)); } };
		// top.iovalue = v
		core.Pioval.synthesizedAttributes[core.Init.core_iovalue__ON__core_IOVal] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Object)context.childAsIs(core.Pioval.i_v)); } };
	}

	public static final common.NodeFactory<Pioval> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pioval> {

		@Override
		public Pioval invoke(final Object[] children) {
			return new Pioval(children);
		}

	};
}
