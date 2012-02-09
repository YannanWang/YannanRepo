package core;

// top::Pair<a b> ::= f::a s::b 
public final class Ppair extends core.NPair {

	public static final int i_f = 0;
	public static final int i_s = 1;

	public static final Class<?> childTypes[] = {Object.class, Object.class};

	public static final int num_local_attrs = Init.count_local__ON__core_pair;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[core.NPair.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[core.NPair.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	}

	public Ppair(final Object c_f, final Object c_s) {
		this(new Object[]{c_f, c_s});
	}

	public Ppair(final Object[] args) {
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
		return "core:pair";
	}

	static void initProductionAttributeDefinitions() {
		// top.fst = f
		core.Ppair.synthesizedAttributes[core.Init.core_fst__ON__core_Pair] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Object)context.childAsIs(core.Ppair.i_f)); } };
		// top.snd = s
		core.Ppair.synthesizedAttributes[core.Init.core_snd__ON__core_Pair] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Object)context.childAsIs(core.Ppair.i_s)); } };
	}

	public static final common.NodeFactory<Ppair> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Ppair> {

		@Override
		public Ppair invoke(final Object[] children) {
			return new Ppair(children);
		}

	};
}
