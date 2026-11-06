(function() {
  document.body.classList.add('dark-theme');
  const style = document.createElement('style');
  style.textContent = `
    body { color: #ffffff !important; }
    .a-color-offset-background { background-color: #010B13 !important; }
    .a-button, .a-button > .a-button-inner { border-radius: 500px !important; }
    .a-button-text { text-transform: none !important; }
    .a-button-primary, .a-button-inner { background: #0074B8 !important; }
  `;
  document.head.appendChild(style);
})();
