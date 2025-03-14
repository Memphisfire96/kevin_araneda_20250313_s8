package com.example.kevin_araneda_20250313_s8

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews

class GaleriaWidgetProvider : AppWidgetProvider() {
    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
        for (appWidgetId in appWidgetIds) {
            val views = RemoteViews(context.packageName, R.layout.widget_galeria)

            views.setImageViewResource(R.id.widgetImageView, R.drawable.imagen1)
            appWidgetManager.updateAppWidget(appWidgetId, views)
        }
    }
}