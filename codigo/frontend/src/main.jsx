import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App.jsx';
import { RouterProvider } from 'react-router-dom';
import { router } from './routes.jsx';
import { DataSharingProvider } from './context/DataSharingContext.jsx'; 

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <DataSharingProvider>
      <RouterProvider router={router}>
        <App />
      </RouterProvider>
    </DataSharingProvider>
  </React.StrictMode>,
);
