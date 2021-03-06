/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.properties.builders;

/**
 * For single-value property descriptors.
 *
 * @param <E> Value type of the built descriptor
 * @param <T> Concrete type of this builder instance.
 *
 */
// @Deprecated // will be rewritten in the next PR and placed in the properties package,
// since there will be no need for a separate package
public abstract class SingleValuePropertyBuilder<E, T extends SingleValuePropertyBuilder<E, T>>
    extends PropertyDescriptorBuilder<E, T> {

    protected E defaultValue;


    protected SingleValuePropertyBuilder(String name) {
        super(name);
    }


    /**
     * Specify a default value.
     *
     * @param val Value
     *
     * @return The same builder
     */
    @SuppressWarnings("unchecked")
    public T defaultValue(E val) {
        this.defaultValue = val;
        return (T) this;
    }


}
