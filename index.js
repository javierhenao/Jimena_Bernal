const report = require('multiple-cucumber-html-reporter');
 
report.generate({
    jsonDir: './reporte_node/report/',
    reportPath: './reporte_node/report/',
    openReportInBrowser: true,
    displayDuration: true,
    
    
    metadata:{
        browser: {
            name: 'chrome',
            version: '8.0'
        },
        device: 'TEST General ',
        platform: {
            name: 'windows',
            version: '10'
        }
    },
    customData: {
        title: 'Reporte Ejecucion',
        data: [
            {label: 'Project', value: 'Prueba'},
            {label: 'Release', value: '1'},
            {label: 'Ciclo', value: '1'},
            {label: 'Execution Start Time', value: 'N/A'},
            {label: 'Execution End Time', value: 'N/A'}
        ]
    }
});
