package co.smartreceipts.android.di.subcomponents;

import co.smartreceipts.android.di.FragmentScope;
import co.smartreceipts.android.settings.widget.CSVColumnsListFragment;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@FragmentScope
@Subcomponent
public interface CSVColumnsListFragmentSubcomponent extends AndroidInjector<CSVColumnsListFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CSVColumnsListFragment> {

    }
}
